package com.jorge.task_manager.controller;

import com.jorge.task_manager.model.Task;
import com.jorge.task_manager.service.TaskService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
    @GetMapping("/{id}")
public Task getTaskById(@PathVariable Long id) {
    return taskService.getTaskById(id);
}
    @PutMapping("/{id}")
public Task updateTask(
        @PathVariable Long id,
        @RequestBody Task task) {

    return taskService.updateTask(id, task);
}
@DeleteMapping("/{id}")
public void deleteTask(@PathVariable Long id) {
    taskService.deleteTask(id);
}
}

