package com.eleadmin.common.system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @Auther:IVAN
 * @Time:2023-05-15-20:07
 */

@Data
@TableName("m_task")
public class Task {
    @TableField("id")
    private Integer id;

    private Integer taskNo;//任务编号
    @TableField("project_name")
    private String projectName;//项目名称
    @TableField("customer_name")
    private String customerName;

    private int status;//任务状态
    @TableField("create_time")
    private Date createTime;//任务创建时间
    @TableField("finish_time")
    private Date finishTime;//任务完成时间

    private double price;
    @TableField("operator_id")
    private Integer operatorId;//操作员id
}
