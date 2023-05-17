package com.eleadmin.common.system.materials.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("m_materials")
public class Material {

    @TableId(type = IdType.AUTO)
    @TableField("material_id")
    private Long id;

    @TableField("material_code")
    private String materialCode;

    @TableField("material_name")
    private String materialName;

    @TableField( "specification")
    private String materialSpecification;

    @TableField( "unit")
    private String materialUnit;

    @TableField( "unit_price")
    private Double unitPrice;
}
