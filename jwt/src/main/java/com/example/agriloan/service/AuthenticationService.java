package com.example.agriloan.service;
import com.example.agriloan.dto.request.LoginRequest;
import com.example.agriloan.dto.request.RegisterRequest;
import com.example.agriloan.dto.response.LoginResponse;
import com.example.agriloan.dto.response.RegisterResponse;

public interface AuthenticationService {
    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);
}