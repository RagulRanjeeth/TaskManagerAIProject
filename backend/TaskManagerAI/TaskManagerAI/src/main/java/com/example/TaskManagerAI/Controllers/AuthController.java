package com.example.TaskManagerAI.Controllers;


import com.example.TaskManagerAI.Autorization.AuthResponse;
import com.example.TaskManagerAI.Autorization.LoginRequest;
import com.example.TaskManagerAI.Entity.UserEntity;
import com.example.TaskManagerAI.Services.AuthorizeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173")
public class AuthController {

    @Autowired
    private AuthorizeServices authService;

    @PostMapping("/register")
    public UserEntity register(@RequestBody UserEntity user) {
        return authService.register(user);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }
}