package com.janiotech.taskflow.domain.valueobjects;

import java.util.regex.Pattern;

public record Password(String value) {
    private static final String PASSWORD_V = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&._-])\\S{8,}$";

    public Password{
        if (value == null || value.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long.");
        }

        if(!Pattern.matches(PASSWORD_V, value)){
            throw new IllegalArgumentException("Password must contain at least one uppercase letter, one lowercase letter, one digit, and one special character.");
        }

    }

    @Override
    public String toString() {
        return value;
    }
}
