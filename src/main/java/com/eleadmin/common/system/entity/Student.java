package com.eleadmin.common.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @Auther:IVAN
 * @Time:2023-03-14-18:04
 */

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Student对象",description = "")
public class Student implements Serializable {
    private static final long ser = 1L;

    @TableId(value = "id",type = IdType.AUTO)//指明主键，且主键自动递增
    private Integer id;

    private String studentid;

    private String name;

    private String major;

    private String grade;
}
