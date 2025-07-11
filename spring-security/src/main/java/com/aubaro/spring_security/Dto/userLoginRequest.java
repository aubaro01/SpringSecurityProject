package com.aubaro.spring_security.Dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
public class userLoginRequest {

    @NotNull(message = "O username não deve estar vazia ou null!!!")
    private String username;

    @NotEmpty(message = "A password não deve estar vazia ou null!!!")
    private String password;

}
