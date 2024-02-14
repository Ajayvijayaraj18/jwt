package com.example.agriloan.config;




import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.agriloan.model.Users;
import com.example.agriloan.repository.UserRepo;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@SuppressWarnings("null")
public class UserCLI implements CommandLineRunner {

    private final UserRepo usersRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (usersRepository.count() > 0)
            return;
        var user = Users.builder()
                .name("Admin")
                .email("admin@gmail.com")
                .password(passwordEncoder.encode("Admin@123"))
                .role(com.example.agriloan.enumerated.Role.ADMIN)
                .build();
        usersRepository.save(user);
    }

}
