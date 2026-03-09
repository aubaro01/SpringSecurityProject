package com.aubaro.spring_security.Adapter.out.DTO;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
public class userLoginRequest {

    @NotNull(message = "O username não deve estar vazia ")
    private String username;

    @NotEmpty(message = "A password não deve estar vazia")
    private String password;

}
