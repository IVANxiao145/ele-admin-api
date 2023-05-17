package com.eleadmin.common.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.eleadmin.common.system.entity.Task;

import java.util.List;

/**
 * @Auther:IVAN
 * @Time:2023-05-15-20:21
 */
public interface TaskService {
    List<Task> getAllTasks();
}
