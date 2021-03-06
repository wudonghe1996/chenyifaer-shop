package com.chenyifaer.back.controller.admin;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.chenyifaer.back.annotation.LogAnnotation;
import com.chenyifaer.back.annotation.RsaAnnotation;
import com.chenyifaer.back.constant.LogConstant;
import com.chenyifaer.back.entity.dto.AdminUserDTO;
import com.chenyifaer.back.entity.dto.LogDTO;
import com.chenyifaer.back.entity.po.AdminUserPO;
import com.chenyifaer.back.entity.po.AdminUserRolePO;
import com.chenyifaer.back.entity.vo.AdminUpdateUserVO;
import com.chenyifaer.back.entity.vo.AdminUserVO;
import com.chenyifaer.back.service.AdminUserRoleService;
import com.chenyifaer.back.service.AdminUserService;
import com.chenyifaer.basic.common.constant.JsonResult;
import com.chenyifaer.basic.common.constant.SystemConstant;
import com.chenyifaer.basic.common.emuns.ResultCodeEnums;
import com.chenyifaer.basic.common.exception.ExportException;
import com.chenyifaer.basic.common.util.CheckUtil;
import com.chenyifaer.basic.common.util.DateUtil;
import com.chenyifaer.basic.common.util.ResponseResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *     _____ _            __     ___ ______                ________ ____ ______ ____
 *	  / ____| |           \ \   / (_)  ____|              / /____  |___ \____  |___ \
 *	 | |    | |__   ___ _ _\ \_/ / _| |__ __ _  ___ _ __ / /_   / /  __) |  / /  __) |
 *	 | |    | '_ \ / _ \ '_ \   / | |  __/ _` |/ _ \ '__| '_ \ / /  |__ <  / /  |__ <
 *	 | |____| | | |  __/ | | | |  | | | | (_| |  __/ |  | (_) / /   ___) |/ /   ___) |
 *	  \_____|_| |_|\___|_| |_|_|  |_|_|  \__,_|\___|_|   \___/_/   |____//_/   |____/
 *
 */

/**
 * 账号管理 - 后台账号表
 * @author wudh
 * @since 2019-04-06
 */
@Slf4j
@RestController
@RequestMapping("/admin/user")
@Api(value = "账号管理",tags = {"账号管理 - 后台用户管理"})
public class AdminUserController {

    @Autowired
    private AdminUserService adminUserService;

    @Autowired
    private AdminUserRoleService adminUserRoleService;

    @ApiOperation(value = "查询用户列表")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "pageIndex", value = "当前页码", required = true, paramType = "query", dataType = "int"),
        @ApiImplicitParam(name = "pageSize", value = "当前页条数", required = true, paramType = "query", dataType = "int"),
        @ApiImplicitParam(name = "adminUserAccount", value = "账号", dataType = "string"),
        @ApiImplicitParam(name = "adminUserName", value = "姓名", dataType = "string"),
        @ApiImplicitParam(name = "adminUserPhone", value = "手机号", dataType = "string"),
        @ApiImplicitParam(name = "adminUserEmail", value = "邮箱", dataType = "string"),
        @ApiImplicitParam(name = "adminRoleName", value = "角色名", dataType = "string"),
        @ApiImplicitParam(name = "status", value = "状态 0：禁用 1：启用", dataType = "int"),
    })
    @RsaAnnotation
    @RequestMapping(value = "/list" , method = RequestMethod.POST)
    public JsonResult list(@RequestBody @Validated AdminUserDTO adminUserDTO , BindingResult br){
        log.debug("【START】 - function AdminUserController - list");
        JsonResult check = CheckUtil.check(br);
        if(check != null){
            log.error("【ERROR】 - function AdminUserController - list 参数校验失败");
            return check;
        }
        PageHelper.startPage(adminUserDTO.getPageIndex(),adminUserDTO.getPageSize());
        List<AdminUserVO> list = this.adminUserService.getList(adminUserDTO);
        PageInfo<AdminUserVO> pageList = new PageInfo<>(list);
        log.debug("【END】 - function AdminUserController - list 查询的结果为：" + list);
        return ResponseResult.Success(ResultCodeEnums.SUCCESS_001,pageList);
    }

    @ApiOperation(value = "根据ID查询用户信息")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "adminUserId", value = "用戶ID", required = true, paramType = "query", dataType = "int"),
    })
    @RsaAnnotation
    @RequestMapping(value = "/getUserById" , method = RequestMethod.POST)
    public JsonResult getUserById(@RequestBody @Validated(AdminUserDTO.GetOne.class) AdminUserDTO adminUserDTO , BindingResult br){
        log.debug("【START】 - function AdminUserController - getUserById");
        JsonResult check = CheckUtil.check(br);
        if(check != null){
            log.error("【ERROR】 - function AdminUserController - getUserById 参数校验失败");
            return check;
        }
        List<AdminUpdateUserVO> list = this.adminUserService.getUserById(adminUserDTO);

        log.debug("【END】 - function AdminUserController - getUserById 查询的结果为：" + list);
        return ResponseResult.Success(ResultCodeEnums.SUCCESS_001,list);
    }

    @ApiOperation(value = "新增账号")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "adminUserAccount", value = "账号", required = true, dataType = "string"),
        @ApiImplicitParam(name = "adminUserName", value = "姓名", required = true, dataType = "string"),
        @ApiImplicitParam(name = "adminRoleId", value = "角色ID", required = true, dataType = "int"),
        @ApiImplicitParam(name = "AdminUserEmail", value = "邮箱", required = false, dataType = "string"),
        @ApiImplicitParam(name = "AdminUserPhone", value = "手机号", required = false, dataType = "string"),
    })
    @LogAnnotation(
        menuName = LogConstant.ADMIN_USER_MENU_NAME,
        action = LogConstant.ADD,
        operation = LogConstant.OPERATION_ADMIN_USER_ADD)
    @RsaAnnotation
    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public JsonResult add(@RequestBody @Validated(AdminUserDTO.Add.class) AdminUserDTO adminUserDTO, BindingResult br){
        log.debug("【START】 - function AdminUserController - add");
        JsonResult check = CheckUtil.check(br);
        if(check != null){
            log.error("【ERROR】 - function AdminUserController - add 参数校验失败");
            return check;
        }

        //判断当前账号是否存在
        int count = this.adminUserService.count(new QueryWrapper<>(new AdminUserPO()
                .setAdminUserAccount(adminUserDTO.getAdminUserAccount())));
        if(count > 0){
            log.error("【ERROR】 - function end AdminUserController - add , 用户【{}】已经存在了",adminUserDTO.getAdminUserAccount());
            return ResponseResult.Success(ResultCodeEnums.CHECK_004);
        }

        //获得要插入的数据
        AdminUserPO adminUserPO = new AdminUserPO()
                .setAdminUserAccount(adminUserDTO.getAdminUserAccount())
                .setAdminUserName(adminUserDTO.getAdminUserName())
                .setAdminUserPassword(SystemConstant.SYSTEM_PASSWORD)
                .setAdminUserEmail(adminUserDTO.getAdminUserEmail())
                .setAdminUserPhone(adminUserDTO.getAdminUserPhone());
        //插入用户表
        boolean flag = this.adminUserService.save(adminUserPO);
        //如果返回的值为成功，则插入用户角色表
        if(flag){
            //插入用户角色表
            flag = this.adminUserRoleService.save(new AdminUserRolePO()
                    .setAdminRoleId(adminUserDTO.getAdminRoleId())
                    .setAdminUserId(adminUserPO.getAdminUserId()));
            //如果再次返回的flag为true，则返回成功
            if(flag){
                log.debug("【END】 - function AdminUserController - add , 新增用户成功");
                return ResponseResult.Success(ResultCodeEnums.SUCCESS_002);
            }
        }

        log.error("【ERROR】 - function AdminUserController - add 新增用户失败");
        return ResponseResult.Fail(ResultCodeEnums.FAIL_10002);
    }

    @ApiOperation(value = "更新用户")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "adminUserId", value = "用户ID", required = true, dataType = "int"),
        @ApiImplicitParam(name = "adminUserName", value = "姓名", dataType = "string"),
        @ApiImplicitParam(name = "adminUserPhone", value = "手机号", dataType = "string"),
        @ApiImplicitParam(name = "adminUserEmail", value = "邮箱", dataType = "string"),
        @ApiImplicitParam(name = "adminRoleId", value = "角色ID", dataType = "int"),
    })
    @LogAnnotation(
        menuName = LogConstant.ADMIN_USER_MENU_NAME,
        action = LogConstant.UPDATE,
        operation = LogConstant.OPERATION_ADMIN_USER_UPDATE)
    @RsaAnnotation
    @RequestMapping(value = "/update" , method = RequestMethod.POST)
    public JsonResult update(@RequestBody @Validated(AdminUserDTO.Update.class) AdminUserDTO adminUserDTO , BindingResult br){
        log.debug("【START】 - function AdminUserController - update");
        JsonResult check = CheckUtil.check(br);
        if(check != null){
            log.error("【ERROR】 - function AdminUserController - update 参数校验失败");
            return check;
        }

        AdminUserPO adminUserPO = new AdminUserPO()
                .setAdminUserId(adminUserDTO.getAdminUserId())
                .setAdminUserName(adminUserDTO.getAdminUserName())
                .setAdminUserPhone(adminUserDTO.getAdminUserPhone())
                .setAdminUserEmail(adminUserDTO.getAdminUserEmail())
                .setUpdateTime(DateUtil.getTime());
        boolean flag = this.adminUserService.updateById(adminUserPO);

        //如果角色ID不为空，则更新用户角色表
        if(adminUserDTO.getAdminRoleId() != null){
            boolean roleFlag = this.adminUserRoleService.update(
                    new AdminUserRolePO().setAdminRoleId(adminUserDTO.getAdminRoleId()),
                    new UpdateWrapper(new AdminUserRolePO().setAdminUserId(adminUserDTO.getAdminUserId())));
            if(roleFlag){
                log.debug("【END】 - function AdminUserController - update , 更新用户成功");
                return ResponseResult.Success(ResultCodeEnums.SUCCESS_003);
            }
        }
        //若flag为true
        if(flag){
            log.debug("【END】 - function AdminUserController - update , 更新用户成功，更新的用户信息为：" + adminUserDTO);
            return ResponseResult.Success(ResultCodeEnums.SUCCESS_003);
        }
        log.error("【ERROR】 - function AdminUserController - update 更新用户失败");
        return ResponseResult.Fail(ResultCodeEnums.FAIL_10003);
    }

    @ApiOperation(value = "禁用/启用用户")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "adminUserId", value = "用户ID", required = true, dataType = "int"),
        @ApiImplicitParam(name = "status", value = "状态 0：禁用 1：启用", required = true, dataType = "int"),
    })
    @LogAnnotation(
        menuName = LogConstant.ADMIN_USER_MENU_NAME,
        action = LogConstant.DISABLE,
        operation = LogConstant.OPERATION_ADMIN_USER_DISABLE)
    @RsaAnnotation
    @RequestMapping(value = "/disableUser" , method = RequestMethod.POST)
    public JsonResult disableUser(@RequestBody @Validated(AdminUserDTO.Disable.class) AdminUserDTO adminUserDTO , BindingResult br){
        log.debug("【START】 - function AdminUserController - disableUser");
        JsonResult check = CheckUtil.check(br);
        if(check != null){
            log.error("【ERROR】 - function AdminUserController - disableUser 参数校验失败");
            return check;
        }
        AdminUserPO adminUserPO = new AdminUserPO()
                .setAdminUserId(adminUserDTO.getAdminUserId())
                .setStatus(adminUserDTO.getStatus())
                .setUpdateTime(DateUtil.getTime());
        boolean flag = this.adminUserService.updateById(adminUserPO);

        //若flag为true
        if(flag){
            log.debug("【END】 - function AdminUserController - disableUser , 禁用/启用用户成功 , 禁用的用户信息为：" + adminUserPO);
            return ResponseResult.Success(ResultCodeEnums.SUCCESS_003);
        }
        log.error("【ERROR】 - function AdminUserController - disableUser , 禁用/启用用户失败");
        return ResponseResult.Fail(ResultCodeEnums.FAIL_10003);
    }

    @ApiOperation(value = "重置用户密码")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "adminUserId", value = "用户ID", required = true, dataType = "int"),
    })
    @LogAnnotation(
        menuName = LogConstant.ADMIN_USER_MENU_NAME,
        action = LogConstant.RESET,
        operation = LogConstant.OPERATION_ADMIN_USER_RESET)
    @RsaAnnotation
    @RequestMapping(value = "/resetUser" , method = RequestMethod.POST)
    public JsonResult resetUser(@RequestBody @Validated(AdminUserDTO.Reset.class) AdminUserDTO adminUserDTO , BindingResult br){
        log.debug("【START】 - function AdminUserController - resetUser");
        JsonResult check = CheckUtil.check(br);
        if(check != null){
            log.error("【ERROR】 - function AdminUserController - resetUser 参数校验失败");
            return check;
        }

        AdminUserPO adminUserPO = new AdminUserPO()
                .setAdminUserId(adminUserDTO.getAdminUserId())
                .setAdminUserPassword(SystemConstant.SYSTEM_PASSWORD)
                .setUpdateTime(DateUtil.getTime());
        boolean flag = this.adminUserService.updateById(adminUserPO);

        //若flag为true
        if(flag){
            log.debug("【END】 - function AdminUserController - resetUser , 密码重置成功，重置的用户信息为：" + adminUserPO);
            return ResponseResult.Success(ResultCodeEnums.SUCCESS_003);
        }
        log.error("【ERROR】 - function AdminUserController - resetUser , 密码重置失败");
        return ResponseResult.Fail(ResultCodeEnums.FAIL_10003);
    }

    @ApiOperation(value = "导出运营账号")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminUserAccount", value = "账号", dataType = "string"),
            @ApiImplicitParam(name = "adminUserName", value = "姓名", dataType = "string"),
            @ApiImplicitParam(name = "adminUserPhone", value = "手机号", dataType = "string"),
            @ApiImplicitParam(name = "adminUserEmail", value = "邮箱", dataType = "string"),
            @ApiImplicitParam(name = "adminRoleName", value = "角色名", dataType = "string"),
            @ApiImplicitParam(name = "status", value = "状态 0：禁用 1：启用", dataType = "int"),
    })
    @LogAnnotation(
            menuName = LogConstant.ADMIN_USER_MENU_NAME,
            action = LogConstant.EXPORT,
            operation = LogConstant.OPERATION_ADMIN_USER_EXPORT)
    @RsaAnnotation
    @RequestMapping(value = "/export", method = RequestMethod.POST)
    public void export(@RequestBody @Validated AdminUserDTO adminUserDTO, HttpServletResponse response) {
        log.debug("【START】 - function AdminUserController - export");
        try {
            this.adminUserService.export(adminUserDTO, response);
        } catch (ExportException e) {
            e.printStackTrace();
        }
        log.debug("【END】 - function AdminUserController - export");
    }

}
