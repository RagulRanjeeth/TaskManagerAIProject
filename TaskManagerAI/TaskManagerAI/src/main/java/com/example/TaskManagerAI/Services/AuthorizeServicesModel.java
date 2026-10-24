package com.example.TaskManagerAI.Services;

import com.example.TaskManagerAI.Autorization.AuthResponse;
import com.example.TaskManagerAI.Autorization.LoginRequest;
import com.example.TaskManagerAI.Entity.UserEntity;

public interface AuthorizeServicesModel {
    UserEntity register(UserEntity user);

    AuthResponse login(LoginRequest request);
}
