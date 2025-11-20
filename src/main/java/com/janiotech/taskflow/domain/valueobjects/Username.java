package com.janiotech.taskflow.domain.valueobjects;

import java.util.regex.Pattern;

public record Username(String value) {
    static private final String USERNAME_REGEX = "^[a-z][a-z0-9_-]{2,31}$";

    public Username{
        if(value == null || value.isBlank() ){
            throw new IllegalArgumentException("Username cannot be null or blank");
        }
        if(!Pattern.matches(USERNAME_REGEX, value)){
            throw new IllegalArgumentException("Invalid username format");
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
