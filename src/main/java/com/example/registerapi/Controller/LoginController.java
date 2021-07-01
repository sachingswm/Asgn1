package com.example.registerapi.Controller;

import com.example.registerapi.Service.LoginServiceImpl;
import com.example.registerapi.constant.ErrorMessage;
import com.example.registerapi.dto.LoginDto;
import com.example.registerapi.exception.InvalidUserDetailsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.example.registerapi.constant.ErrorMessage.USER_NOT_EXISTS;

@RestController
public class LoginController {

    @Autowired
    private LoginServiceImpl authenticationService;

    //Login Request
    @PostMapping("/login")
    public String login(@RequestBody LoginDto loginDto) throws InvalidUserDetailsException {
        //Check for authentication
        if(!authenticationService.isAuthenticated(loginDto))
        {
            throw new InvalidUserDetailsException(USER_NOT_EXISTS);
        }
        return "Successfully Logged In!";
    }
}
