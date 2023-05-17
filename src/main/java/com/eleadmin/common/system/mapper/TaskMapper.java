package com.eleadmin.common.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eleadmin.common.system.entity.Task;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther:IVAN
 * @Time:2023-05-15-20:26
 */
@Mapper
public interface TaskMapper extends BaseMapper<Task> {
    List<Task> getAllTasks();
}
