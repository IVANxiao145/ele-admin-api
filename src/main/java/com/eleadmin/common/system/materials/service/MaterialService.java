package com.eleadmin.common.system.materials.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.eleadmin.common.system.materials.entity.Material;
import org.springframework.stereotype.Service;


public interface MaterialService extends IService<Material> {

    IPage<Material> selectPage(Page<Material> pageParam);
}
