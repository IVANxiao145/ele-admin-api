package com.eleadmin.common.system.controller;

import com.eleadmin.common.core.web.ApiResult;
import com.eleadmin.common.core.web.BaseController;
import com.eleadmin.common.system.entity.Student;
import com.eleadmin.common.system.service.StudentService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:IVAN
 * @Time:2023-03-14-18:18
 */
@RestController
@RequestMapping("/api/system/student")
public class StudentController extends BaseController {

    @Resource
    private StudentService studentService;

    @PreAuthorize("hasAuthority('sys:user:list')")
    public ApiResult<List<Student>> findAll(){
        return success(studentService.findAll());
    }
}
