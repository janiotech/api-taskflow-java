package com.janiotech.taskflow.domain.entities;

import com.janiotech.taskflow.domain.valueobjects.BirthDate;
import com.janiotech.taskflow.domain.valueobjects.Email;
import com.janiotech.taskflow.domain.valueobjects.Password;
import com.janiotech.taskflow.domain.valueobjects.Phone;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
    private Long id;
    private String name;
    private BirthDate birth;
    private String gender;
    private Phone phone;
    private String username;
    private Email email;
    private Password password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public User(){}

    public User(String name, BirthDate birth, String gender, Phone phone, String username, Email email, Password password){
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.phone = phone;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BirthDate getBirth() {
        return birth;
    }

    public void setBirth(BirthDate birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Password getPassword() {return password;}

    public void setPassword(Password password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
