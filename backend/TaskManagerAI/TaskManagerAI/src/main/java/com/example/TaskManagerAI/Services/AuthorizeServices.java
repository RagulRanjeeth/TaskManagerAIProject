package com.example.TaskManagerAI.Services;

import com.example.TaskManagerAI.Autorization.AuthResponse;
import com.example.TaskManagerAI.Autorization.LoginRequest;
import com.example.TaskManagerAI.Entity.UserEntity;
import com.example.TaskManagerAI.Repositor.UserRepositor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorizeServices implements AuthorizeServicesModel {

    @Autowired
    private UserRepositor userRepositor;

    @Override
    public UserEntity register(UserEntity user) {

        user.setRole("USER");

        return userRepositor.save(user);
    }

    @Override
    public AuthResponse login(LoginRequest request) {

        UserEntity user = userRepositor.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User Not Found"));

        if (!request.getPassword().equals(user.getPassword())) {
            throw new RuntimeException("Invalid Password");
        }

        return new AuthResponse("Login Successful");
    }
}