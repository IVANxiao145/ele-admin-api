package com.eleadmin.common.system.materials.service.impl;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eleadmin.common.system.materials.entity.Material;
import com.eleadmin.common.system.materials.mapper.MaterialMapper;
import com.eleadmin.common.system.materials.service.MaterialService;
import org.springframework.stereotype.Service;

@Service
public class MaterialServiceImpl extends ServiceImpl<MaterialMapper, Material> implements MaterialService{

    @Override
    public IPage<Material> selectPage(Page<Material> pageParam) {
        return null;
    }
}
