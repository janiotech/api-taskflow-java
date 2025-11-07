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
    }

    public int getAge(){
        return LocalDate.now().getYear() - value.getYear();
    }
}
