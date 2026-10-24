package com.example.TaskManagerAI.Services;

import com.example.TaskManagerAI.Entity.TaskManager;
import com.example.TaskManagerAI.Repositor.TaskRepositor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskServices implements TaskServicesModel {

@Autowired
private TaskRepositor taskRepositor;

    public List<TaskManager> getAllTasks() {
        return taskRepositor.findAll();
    }


    public TaskManager createTasks(TaskManager task) {
        return taskRepositor.save(task);
    }

    public TaskManager updateTask(Long id, TaskManager task) {
        TaskManager tasks = taskRepositor.findById(id).orElseThrow();

        tasks.setTitle(task.getTitle());
        tasks.setDescription(task.getDescription());
        tasks.setPriority(task.getPriority());
        tasks.setStatus(task.getStatus());
        tasks.setDeadline(task.getDeadline());

        return taskRepositor.save(tasks);
    }

    public void deleteTask(Long id) {
        taskRepositor.deleteById(id);
    }
}
