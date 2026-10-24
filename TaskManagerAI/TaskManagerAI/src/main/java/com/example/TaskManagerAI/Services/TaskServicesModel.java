package com.example.TaskManagerAI.Services;

import com.example.TaskManagerAI.Entity.TaskManager;

import java.util.List;

public interface TaskServicesModel {

    List<TaskManager> getAllTasks();

    TaskManager createTasks(TaskManager task);

    TaskManager updateTask(Long id, TaskManager task);

    void deleteTask(Long id);
}
