# Spring Security
Um projeto simples que visa aplicar os conceitos de spring security com tokens de auth para uma api de users...

## Stack utilizada

**Java**, **Spring boot**, **MongoDB**, **JWT auth**


## EndPoints:

### GET

Detalhes do user
``` 
/api/v1/userDetails/{id}´  -> requer token de auth e id do user;
```
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O id do user que  quer |


Detalhes sobre atividade do user
```
/api/v1/userDetails/active/{id} -> requer token de auth e id do user;
```
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O id do user que  quer |
### POST

Login e requisição de um token
``` 
/api/v1/auth/login -> login e requisição de um token de acesso
```
Refresh do token do user logado
``` 
/api/v1/newToken/{id} -> refresh do token  e id do user;
```
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O id do user que  quer |

Criar novo user
``` 
/api/v1/signup -> criar novo user;
```

Update de info acerca do user ou atualização de perfil
``` 
/api/v1/userDetails/updateUser/{id} ->  fazer update a daods de um user;
```
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O id do user que  quer |
### DELETE 

Apagar a conta de um user
```
/api/v1/deleteUser/{id} -> requer token de auth e id do user;
```
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O id do user que  quer |
## 
## Fluxo 




