package com.aubaro.spring_security.Dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
public class userLogin {

    @NotNull
    private String username;

    @NotEmpty
    private String password;

}
