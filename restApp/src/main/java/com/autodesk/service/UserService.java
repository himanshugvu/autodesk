package com.autodesk.service;

import com.autodesk.model.User;

public interface UserService {

	  public User saveUser (User newUser);
	  public void checkUserExists(String username) ;
}
