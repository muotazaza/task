package com.example.taskmanagement.system.service;

import com.example.taskmanagement.system.entity.Task;
import com.example.taskmanagement.system.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTask (){
        return taskRepository.findAll();
    }
    public Optional <Task> findTaskById(Long theId){
        return taskRepository.findById(theId);
    }
    public Task createTask( Task task){
        return taskRepository.save(task);
    }
    public void delete (Long id){
        taskRepository.deleteById(id);
    }
}
