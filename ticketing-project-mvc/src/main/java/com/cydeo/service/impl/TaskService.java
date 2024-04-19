package com.cydeo.service.impl;

import com.cydeo.dto.TaskDTO;
import com.cydeo.service.CrudService;
import org.springframework.stereotype.Service;

@Service
public interface TaskService extends CrudService<TaskDTO,Long> {
}
