package com.eleadmin.common.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eleadmin.common.system.entity.Task;
import com.eleadmin.common.system.mapper.TaskMapper;
import com.eleadmin.common.system.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @Auther:IVAN
 * @Time:2023-05-15-20:21
 */
@Service
public class TaskServiceImpl  implements TaskService {

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public List<Task> getAllTasks() {
        return taskMapper.getAllTasks();
    }


}
