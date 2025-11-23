package com.janiotech.taskflow.domain.repositories;

import com.janiotech.taskflow.domain.entities.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository {
    void save(User user);
    Optional<User> findById(UUID id);
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
    List<User> findAllPaginated(int page, int size);
    long countAll();
}
