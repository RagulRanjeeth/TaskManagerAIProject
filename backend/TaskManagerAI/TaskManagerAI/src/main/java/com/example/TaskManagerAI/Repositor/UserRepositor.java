package com.example.TaskManagerAI.Repositor;

import com.example.TaskManagerAI.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepositor extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
}
