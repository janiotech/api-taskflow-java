package com.janiotech.taskflow.domain.valueobjects;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public record BirthDate(LocalDate value) {
    private static final int MINIMUM_AGE = 13;

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

    @Override
    public String toString() {
        return value.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    private static int getAge(LocalDate date) {
        return Period.between(date, LocalDate.now()).getYears();
    }

    public int getAge(){
        return getAge(value);
    }

    public int getYear(){
        return value.getYear();
    }

    public int 	getDayOfMonth(){
        return value.getDayOfMonth();
    }

    public int getMonthValue(){
        return value.getMonthValue();
    }
}
