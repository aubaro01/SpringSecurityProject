package com.aubaro.spring_security.Core.port.in;

import com.aubaro.spring_security.Core.Model.UserModel;

public interface UserOperations {

    UserModel createUser(UserModel model);
}
