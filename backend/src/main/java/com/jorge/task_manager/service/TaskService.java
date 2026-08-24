package com.jorge.task_manager.service;

import org.springframework.stereotype.Service;
import com.jorge.task_manager.model.Task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import com.jorge.task_manager.exception.TaskNotFoundException;

@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();
private Long nextId = 1L;
 public Task createTask(Task task) {
    task.setId(nextId);
    nextId++;

    task.setCreatedAt(LocalDateTime.now());

    tasks.add(task);

    return task;
}
public List<Task> getAllTasks() {
    return tasks;
}
public Task getTaskById(Long id) {
    for (Task task : tasks) {
        if (task.getId().equals(id)) {
            return task;
        }
    }
    throw new TaskNotFoundException(id);

}
public Task updateTask(Long id, Task updatedTask) {

    Task existingTask = getTaskById(id);

    existingTask.setTitle(updatedTask.getTitle());
    existingTask.setDescription(updatedTask.getDescription());
    existingTask.setCompleted(updatedTask.isCompleted());

    return existingTask;
}
public void deleteTask(Long id) {

    Task task = getTaskById(id);

    tasks.remove(task);
}
}