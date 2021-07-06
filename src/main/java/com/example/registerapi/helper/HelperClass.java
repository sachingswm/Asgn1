package com.example.registerapi.helper;

import com.example.registerapi.dto.CurrentClassDto;
import com.example.registerapi.exception.InvalidUserDetailsException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class HelperClass {
    public static void validationOfCurrClassDto(CurrentClassDto currentClassDto)throws InvalidUserDetailsException
    {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<CurrentClassDto>> violations = validator.validate(currentClassDto);
        for (ConstraintViolation<CurrentClassDto> violation : violations) {
            throw new InvalidUserDetailsException(violation.getMessage());
        }
    }
}
