package com.aubaro.spring_security.Core.port.out;

import com.aubaro.spring_security.Core.Model.UserModel;

public interface UserPersistence {

    UserModel createUser (UserModel model);
}
