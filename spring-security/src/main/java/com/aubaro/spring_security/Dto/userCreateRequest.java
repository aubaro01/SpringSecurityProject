package com.aubaro.spring_security.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor

public class userCreateRequest {

    @NotNull
    private String nome;

    @NotNull
    private String username;

    @NotEmpty
    private String password;

    @NotNull
    @Email(message = "Email incorreto!")
    private String email;
}
