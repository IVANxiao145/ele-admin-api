package com.eleadmin.common.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.eleadmin.common.system.entity.Student;

import java.util.List;

/**
 * @Auther:IVAN
 * @Time:2023-03-14-18:23
 */
public interface StudentService extends IService<Student> {

    public List<Student> findAll();
}
