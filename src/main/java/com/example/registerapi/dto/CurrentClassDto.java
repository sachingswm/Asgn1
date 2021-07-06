package com.example.registerapi.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import static com.example.registerapi.constant.ValidationMessage.NAME_MANDATORY;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class CurrentClassDto {
    @NotBlank(message = NAME_MANDATORY)
    @NotNull
    private String current_class_dto_name;
}
