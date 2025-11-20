package com.janiotech.taskflow.domain.valueobjects;

import java.util.regex.Pattern;

public record Email(String value) {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9._%+-]+@(gmail|hotmail|outlook)\\.(com|com\\.br)$");
    public Email{
        if(value == null || value.isBlank()){
            throw new IllegalArgumentException("The field cannot be null or blank");
        }

        String normalized = value.trim().toLowerCase();

        if (!EMAIL_PATTERN.matcher(normalized).matches()) {
            throw new IllegalArgumentException("Invalid email format: " + value);
        }
        value = normalized;
    }

    @Override
    public String toString() {
        return value;
    }
}
