package com.web.tms.task_management_system.service;

import com.web.tms.task_management_system.entity.TaskEntity;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<TaskEntity> findAllTask();

    Optional<TaskEntity> findById(Long taskId);

    TaskEntity saveTask(TaskEntity taskEntity);
    TaskEntity updateTask(Long taskId,TaskEntity taskEntity);
    void deleteTask(Long id);
}
