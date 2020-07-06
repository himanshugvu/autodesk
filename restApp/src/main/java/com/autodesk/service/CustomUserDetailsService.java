package com.autodesk.service;

import com.autodesk.model.User;

public interface CustomUserDetailsService {
	public User loadUserById(Long id);

}
