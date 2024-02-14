package com.example.agriloan.service.impl;





import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.agriloan.dto.request.LoginRequest;
import com.example.agriloan.dto.request.RegisterRequest;
import com.example.agriloan.dto.response.LoginResponse;
import com.example.agriloan.dto.response.RegisterResponse;
import com.example.agriloan.model.Users;
import com.example.agriloan.repository.UserRepo;
import com.example.agriloan.service.AuthenticationService;
import com.example.agriloan.utils.JwtUtil;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@SuppressWarnings("null")
public class AuthenticationServiceImpl implements AuthenticationService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepo usersRepository;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    @Override
    public RegisterResponse register(RegisterRequest request) {
        if (!request.getPassword().equals(request.getConfirmPassword())) {
            return RegisterResponse.builder()
                    .message("Password and ConfirmPassword do not match")
                    .build();
        }

        var user = Users.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(com.example.agriloan.enumerated.Role.USER)
                .build();
        usersRepository.save(user);
        return RegisterResponse.builder()
                .message("User registered successfully")
                .build();
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        var user = usersRepository.findByEmail(request.getEmail()).orElseThrow();
        var token = jwtUtil.generateToken(user);
        return LoginResponse.builder()
                .message("Logged in successfully.")
                .token(token)
                .build();
    }

}