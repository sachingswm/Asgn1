package com.example.registerapi.dto;

import com.example.registerapi.exception.InvalidUserDetailsException;
import com.example.registerapi.helper.HelperClass;
import com.sun.istack.NotNull;
import lombok.*;

import javax.validation.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import java.util.Set;

import static com.example.registerapi.constant.ValidationMessage.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class RegisterDto {
    @NotBlank(message = NAME_MANDATORY)
    @NotNull
    private String name;
    @NotBlank(message = EMAIL_MANDATORY)
    @NotNull
    private String email;
    @NotBlank(message = PASSWORD_MANDATORY)
    @Size(min=10,message=PASSWORD_SIZE)
    private String password;
    @NotNull
    private CurrentClassDto currentClassDto;



    public RegisterDto(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void setCurrentClassDto(CurrentClassDto currentClassDto)throws InvalidUserDetailsException {
        HelperClass.validationOfCurrClassDto(currentClassDto);
        this.currentClassDto = currentClassDto;
    }
}
