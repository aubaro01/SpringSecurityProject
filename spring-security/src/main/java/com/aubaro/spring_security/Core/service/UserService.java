package com.aubaro.spring_security.Core.service;

import com.aubaro.spring_security.Core.Model.UserModel;
import com.aubaro.spring_security.Core.port.in.UserOperations;
import lombok.*;

@RequiredArgsConstructor
public class UserService implements UserOperations {

    @Override
        public UserModel createUser(UserModel user) {
            return user;
        }
}
