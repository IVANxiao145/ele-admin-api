package com.eleadmin.common.system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Auther:IVAN
 * @Time:2023-05-15-20:17
 */
@Data
@TableName("m_operator")
public class Operator {

    private Integer id;

    private String name;
    @TableField("job_number")
    private Integer jobNumber;

    private Integer roleId;
}
