package com.janiotech.taskflow.domain.entities;

import com.janiotech.taskflow.domain.valueobjects.BirthDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
    private Long id;
    private String name;
    private BirthDate birth;
    private String gender;
    private String phone;
    private String username;
    private String email;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public User(String name, BirthDate birth, String gender, String phone, String username, String email, String password){
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
