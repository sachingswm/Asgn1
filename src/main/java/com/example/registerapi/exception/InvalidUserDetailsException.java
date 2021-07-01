package com.example.registerapi.exception;

public class InvalidUserDetailsException extends Exception{
    public InvalidUserDetailsException(String s)
    {
        super(s);
    }
}
