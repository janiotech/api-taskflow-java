package com.janiotech.taskflow.domain.valueobjects;

import java.time.LocalDate;

public record BirthDate(LocalDate value) {
    public BirthDate{
        if(value == null){
            throw new IllegalArgumentException("Birth date cannot be null");
        }
        if(value.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Birth date cannot be in the future");
        }
        if(LocalDate.now().getYear() - value.getYear() < 13){
            throw new IllegalArgumentException("Children under 13 years old cannot create an account.");
        }
    }

    public int getAge(){
        return LocalDate.now().getYear() - value.getYear();
    }
}
