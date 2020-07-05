package com.autodesk.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.autodesk.model.User;
import com.autodesk.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/registration")
    public String createNewUser(@Valid @RequestBody  User user, BindingResult bindingResult) {
        User userExists = userService.findUserByEmail(user.getEmail());
        if (userExists != null) {
           return ("There is already a user registered with the email provided");
        }
        if (bindingResult.hasErrors()) {
        	 return ("User registeration failed");
        } else {
            userService.saveUser(user);
            return ("User has been registered successfully");

        }
    }

}
