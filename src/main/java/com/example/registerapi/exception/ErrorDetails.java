package com.example.registerapi.exception;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String detaiils;
}
