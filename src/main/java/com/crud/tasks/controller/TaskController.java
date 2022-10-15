package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/tasks")
public class TaskController {

    @GetMapping
    private List<TaskDto> getTasks() {
        return new ArrayList<>();
    }


    private TaskDto getTask(Long taskId) {
        return new TaskDto(1L, "test title", "test_content");
    }


    private void deleteTask(Long taskId) {

    }


    private TaskDto updateTask(TaskDto task) {
        return new TaskDto(1L, "Edited test title", "Test content");
    }


    private void createTask(TaskDto task) {

    }
}
