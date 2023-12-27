package com.example.taskmanagement.system.repository;

import com.example.taskmanagement.system.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
