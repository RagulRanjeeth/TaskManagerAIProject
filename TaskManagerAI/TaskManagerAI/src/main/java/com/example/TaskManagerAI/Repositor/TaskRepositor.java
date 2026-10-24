package com.example.TaskManagerAI.Repositor;

import com.example.TaskManagerAI.Entity.TaskManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface TaskRepositor  extends JpaRepository<TaskManager, Long> {
    List<TaskManager> findByStatus(String status);

}
