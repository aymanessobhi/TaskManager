package com.web.tms.task_management_system.service.impl;

import com.web.tms.task_management_system.entity.TaskEntity;
import com.web.tms.task_management_system.repository.TaskRespository;
import com.web.tms.task_management_system.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRespository taskRespository;

    public TaskServiceImpl(TaskRespository taskRespository) {
        this.taskRespository = taskRespository;
    }

    @Override
    public List<TaskEntity> findAllTask() {
        return taskRespository.findAll();
    }

    @Override
    public Optional<TaskEntity> findById(Long taskId) {
        return taskRespository.findById(taskId);
    }

    @Override
    public TaskEntity saveTask(TaskEntity taskEntity) {
        return taskRespository.save(taskEntity);
    }

    @Override
    public TaskEntity updateTask(Long taskId,TaskEntity taskEntity) {
        return taskRespository.save(taskEntity);
    }

    @Override
    public void deleteTask(Long taskId) {
        taskRespository.deleteById(taskId);
    }
}
