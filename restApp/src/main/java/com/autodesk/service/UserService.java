package com.autodesk.service;

import com.autodesk.model.User;

public interface UserService {

    public User findUserByEmail(String email) ;
    public User saveUser(User user);
}
