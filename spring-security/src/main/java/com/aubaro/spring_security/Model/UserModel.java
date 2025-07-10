package com.aubaro.spring_security.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "SpUsers")

public class UserModel {

    @Id
    private String id;

    private String nome;

    private String username;

    private String password;

    private String email;

    private String detals;
}
 