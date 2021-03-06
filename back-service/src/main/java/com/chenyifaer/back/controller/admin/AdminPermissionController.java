package com.chenyifaer.back.controller.admin;


import com.chenyifaer.back.annotation.RsaAnnotation;
import com.chenyifaer.back.entity.dto.AdminUserMenuDTO;
import com.chenyifaer.back.entity.vo.AdminPermissionMenuVO;
import com.chenyifaer.back.entity.vo.AdminUserMenuVO;
import com.chenyifaer.back.service.AdminPermissionService;
import com.chenyifaer.basic.common.constant.JsonResult;
import com.chenyifaer.basic.common.emuns.ResultCodeEnums;
import com.chenyifaer.basic.common.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 权限管理 - 后台权限表 前端控制器
 * @author wudh
 * @since 2019-04-06
 */
@Slf4j
@RestController
@RequestMapping("/admin/permission")
@Api(value = "账号管理",tags = {"账号管理 - 后台权限管理"})
public class AdminPermissionController {

    @Autowired
    private AdminPermissionService adminPermissionService;

    @ApiOperation(value = "查询权限列表")
    @RsaAnnotation
    @RequestMapping(value = "/list" , method = RequestMethod.POST)
    public JsonResult list(){
        log.debug("【START】 - function AdminPermissionController - list");
        List<AdminPermissionMenuVO> list = this.adminPermissionService.getList();
        log.debug("【END】 - function AdminPermissionController - list 查询的结果为：" + list);
        return ResponseResult.Success(ResultCodeEnums.SUCCESS_001,list);
    }

    @ApiOperation(value = "查询当前登录用户拥有的权限")
    @RequestMapping(value = "/getUserMenuList" , method = RequestMethod.POST)
    public JsonResult getUserMenuList(@RequestBody AdminUserMenuDTO adminUserMenuDTO){
        log.debug("【START】 - function AdminPermissionController - getUserMenuList");
        List<AdminUserMenuVO> list = this.adminPermissionService.getUserMenuList(adminUserMenuDTO);
        log.debug("【END】 - function AdminPermissionController - getUserMenuList 查询的结果为：" + list);
        return ResponseResult.Success(ResultCodeEnums.SUCCESS_001,list);
    }


}
