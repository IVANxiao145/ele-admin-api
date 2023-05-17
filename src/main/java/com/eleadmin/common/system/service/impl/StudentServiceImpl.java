package com.eleadmin.common.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eleadmin.common.system.entity.Student;
import com.eleadmin.common.system.mapper.StudentMapper;
import com.eleadmin.common.system.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:IVAN
 * @Time:2023-03-14-18:25
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService{
    @Override
    public List<Student> findAll() {
        return null;
    }
}
