package com.autodesk.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.autodesk.exception.UsernameAlreadyExistsException;
import com.autodesk.exception.UsernameDoesNotExistsException;
import com.autodesk.model.User;
import com.autodesk.repository.UserRepository;
import com.autodesk.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User saveUser (User newUser){

        try{
            newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
            //Username has to be unique (exception)
            newUser.setUsername(newUser.getUsername());
            return userRepository.save(newUser);

        }catch (Exception e){
            throw new UsernameAlreadyExistsException("Username '"+newUser.getUsername()+"' already exists");
        }

    }
    
    @Override
    public void checkUserExists(String username) {
    	  User user = userRepository.findByUsername(username);
          if(user==null) 
        	  throw new UsernameDoesNotExistsException("Username '"+username+"' not found");
    }



}
