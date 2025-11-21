package com.janiotech.taskflow.application.usecase;

import com.janiotech.taskflow.domain.entities.User;
import com.janiotech.taskflow.domain.repositories.UserRepository;

public class CreateUserUseCase {
    private final UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(User user) {
        userRepository.save(user);
    }
}
