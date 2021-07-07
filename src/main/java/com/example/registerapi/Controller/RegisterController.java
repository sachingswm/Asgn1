package com.example.registerapi.Controller;

import com.example.registerapi.Service.RegisterServiceImpl;
import com.example.registerapi.constant.EndPoints;
import com.example.registerapi.constant.ErrorMessage;
import com.example.registerapi.dto.RegisterDto;
import com.example.registerapi.exception.InvalidUserDetailsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.registerapi.entities.User;
import javax.validation.Valid;

import static com.example.registerapi.constant.ErrorMessage.EMAIL_ALREADY_EXISTS;

@RestController
public class RegisterController {
    @Autowired
    private RegisterServiceImpl registerServiceImpl;

    @PostMapping(EndPoints.POST_REGISTER)
    public String register(@Valid @RequestBody RegisterDto registerDto) throws InvalidUserDetailsException {
        if(!registerServiceImpl.validEmail(registerDto.getEmail()))
            throw new InvalidUserDetailsException(EMAIL_ALREADY_EXISTS);
        registerServiceImpl.saveUser(new User(registerDto));
        return "User registered Successfully";
    }

}
