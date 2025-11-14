package com.janiotech.taskflow.domain.valueobjects;

public record Phone(String value) {

    public Phone {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Phone number cannot be null or blank");
        }

        String cleaned = value.replaceAll("[\\s\\-()]", "");

        if (!isValid(cleaned)) {
            throw new IllegalArgumentException("Invalid phone number: " + value);
        }

        value = normalize(cleaned);
    }

    private static boolean isValid(String phone) {
        return phone.matches("^\\+?[1-9]\\d{6,14}$");
    }

    private static String normalize(String phone) {
        if (!phone.startsWith("+")) {
            phone = "+" + phone;
        }
        return phone;
    }

    @Override
    public String toString() {
        return value;
    }
}
