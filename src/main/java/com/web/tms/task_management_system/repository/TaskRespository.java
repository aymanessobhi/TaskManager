package com.web.tms.task_management_system.repository;

import com.web.tms.task_management_system.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRespository extends JpaRepository<TaskEntity,Long> {
}
