package com.aubaro.spring_security.Dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor

public class userCreate {

    @NotNull
    private String nome;

    @NotNull
    private String username;

    @NotEmpty
    private String password;

    @NotNull
    private String email;
}
