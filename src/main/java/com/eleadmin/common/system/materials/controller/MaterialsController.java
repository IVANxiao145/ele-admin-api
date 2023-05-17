package com.eleadmin.common.system.materials.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eleadmin.common.core.web.ApiResult;
import com.eleadmin.common.core.web.BaseController;
import com.eleadmin.common.core.web.PageResult;
import com.eleadmin.common.system.materials.entity.Material;
import com.eleadmin.common.system.materials.service.MaterialService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/material")
public class MaterialsController extends BaseController {
    @Autowired
    private MaterialService materialService;

    //查询所有角色
    @GetMapping("/findAll")
    public ApiResult getMaterials(){
        List<Material> list = materialService.list();
        return success(list);
    }

    //测试逻辑删除
    @ApiOperation("测试逻辑删除")
    @DeleteMapping("/remove/{id}")
    public ApiResult<?> removeRole(@PathVariable Long id){
        boolean b = materialService.removeById(id);
        if (b){
            return success("删除成功");
        }else return fail("删除失败");
    }

    @ApiOperation("条件分页查询")
    @GetMapping("/pages/{pageNum}/{pageSize}")
    public ApiResult<PageResult<Material>> getPages(@PathVariable Long pageNum, @PathVariable Long pageSize){
        Page<Material> pageParam = new Page<>(pageNum, pageSize);
        IPage<Material> pageModel=materialService.selectPage(pageParam);
        return success(pageModel);
    }

    @ApiOperation("添加原材料")
    @PostMapping("/save")
    public ApiResult<?> saveMaterial(@RequestBody Material material){
        boolean isSave = materialService.save(material);
        return isSave?success("添加成功"):fail("添加失败");
    }

    @ApiOperation("根据id查询角色")
    @GetMapping("/getMaterial/{id}")
    public ApiResult<Material> getRole(@PathVariable Long id){
        Material byId = materialService.getById(id);
        return success(byId);
    }

    @ApiOperation("修改原材料信息")
    @PostMapping("/update")
    public ApiResult<?> updateMaterial(@RequestBody Material material){
        boolean isUpdate = materialService.updateById(material);
        return isUpdate?success("修改成功"):fail("修改失败");
    }

    @ApiOperation("批量删除")
    @DeleteMapping("/batchRemove")
    public ApiResult<?> batchRemove(@RequestBody List<Long> Ids){
        boolean isRemove= materialService.removeByIds(Ids);
        return isRemove?success("删除成功"):fail("删除失败");
    }

}
