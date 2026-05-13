package com.example.TaskManagerAI.Controllers;

import com.example.TaskManagerAI.Entity.TaskManager;
import com.example.TaskManagerAI.Services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
@CrossOrigin(origins = "http://localhost:5173")
public class TaskController {

    @Autowired
    private TaskServices taskServices;

    @GetMapping
    public List<TaskManager> getAllTasks(){
        return taskServices.getAllTasks();
    }

    @PostMapping
    public TaskManager createTasks(@RequestBody TaskManager task)
    {
        return taskServices.createTasks(task);
    }

    @PutMapping("/{id}")
    public TaskManager updateTask(@PathVariable Long id, @RequestBody TaskManager task) {
        return taskServices.updateTask(id, task);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskServices.deleteTask(id);
        return "Task Deleted Successfully";
    }
}

