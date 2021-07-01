package com.example.registerapi.dto;

import com.sun.istack.NotNull;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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
}
