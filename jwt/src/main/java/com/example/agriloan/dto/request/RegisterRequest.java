package com.example.agriloan.dto.request;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
// import lombok.NonNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    // @NonNull
    private String name;


    private String email;

 
    private String password;

    
    private String confirmPassword;
}
