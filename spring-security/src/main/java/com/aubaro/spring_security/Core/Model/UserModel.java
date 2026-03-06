package com.aubaro.spring_security.Core.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Document(collation = "SpUsers")

public class UserModel {

    @Id
    private String id;

    @NotBlank(message = "O campo nome é obrigatório!!")
    @Size(max = 20, min = 10,  message = "O nome não deve ter mais de 20 caracteres!")
    private String name;

    @NotBlank(message = "O campo username é obrigatório!!")
    @Size(max = 15, min = 6,  message = "O username não deve ter mais de 15 caracteres!")
    private String username;

    @NotBlank(message = "O campo password é obrigatório!!")
    @Size(max = 20, min = 10,  message = "A password não deve ter mais de 20 caracteres!")
    private String password;

    @NotBlank(message = "O campo email é obrigatório!!")
    @Email(message = "Email não é valido!!")
    private String email;

    @Size(max = 200, message = "O campo de detalhes não pode ter mais de 200 caracteres!")
    private String details;

}
 