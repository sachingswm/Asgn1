package com.example.registerapi.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static com.example.registerapi.constant.ValidationMessage.MUST_BE_IN_CLASS;
import static com.example.registerapi.constant.ValidationMessage.NAME_MANDATORY;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class CurrentClassDto {
    @NotBlank(message = NAME_MANDATORY)
    @NotNull
    @Size(min=1,message = MUST_BE_IN_CLASS)
    private String current_class_dto_name;
}
