package com.chenyifaer.back.constant;

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
 * 自定义日志注解 - 常量
 * @Author:wudh
 * @Date: 2019/4/7 19:58
 */
public class LogConstant {


    /**********************************************/
    /** 菜单名 */
    public static final String SYSTEM_MENU_NAME = "喜瑞斯商城";

    public static final String ADMIN_USER_MENU_NAME = "运营账号管理";

    public static final String ADMIN_ROLE_MENU_NAME = "后台角色管理";

    public static final String ADMIN_MENU_MENU_NAME = "菜单管理";

    public static final String USER_MENU_NAME = "用户管理";

    public static final String ROLE_MENU_NAME = "角色管理";

    public static final String GOODS_TYPE_MENU_NAME = "商品分类管理";

    public static final String GOODS_SKU_KEY_MENU_NAME = "SKU分类管理";

    public static final String GOODS_SKU_VALUE_MENU_NAME = "SKU属性管理";

    public static final String GOODS_MENU_NAME = "商品管理";

    public static final String GOODS_CHECK_MENU_NAME = "商品审核管理";

    public static final String ORDERS_MENU_NAME = "订单管理";

    public static final String RETURN_ORDERS_MENU_NAME = "退单管理";

    public static final String PAY_MENU_NAME = "支付管理";

    public static final String PAY_RETURN_MENU_NAME = "退款管理";

    public static final String LOG_MENU_NAME = "日志管理";

    public static final String BANNER_MENU_NAME = "轮播图管理";

    /**********************************************/
    /** 动作 */
    public static final String LOGIN = "登录";

    public static final String LOGIN_OUT = "登出";

    public static final String SELECT = "查询";

    public static final String ADD = "新增";

    public static final String UPDATE = "更新";

    public static final String DELETE = "删除";

    public static final String PERMISSION = "授权";

    public static final String DISABLE = "禁用/启用";

    public static final String RESET = "重置";

    public static final String CHECK = "审核";

    public static final String EXPORT = "导出";

    public static final String IMPORT = "导入";

    public static final String UPLOAD = "上传";

    /**********************************************/
    /** 操作 */
    /** 系统操作 */
    public static final String OPERATION_SYSTEM_LOGIN = "系统登录";

    /** 后台用户列表 */
    public static final String OPERATION_ADMIN_USER_ADD = "新增用户";
    public static final String OPERATION_ADMIN_USER_UPDATE = "更新用户";
    public static final String OPERATION_ADMIN_USER_DISABLE = "禁用/启用用户";
    public static final String OPERATION_ADMIN_USER_RESET = "重置用户密码";
    public static final String OPERATION_ADMIN_USER_EXPORT = "导出用户列表";

    /** 后台角色列表 */
    public static final String OPERATION_ADMIN_ROLE_ADD = "新增角色";
    public static final String OPERATION_ADMIN_ROLE_UPDATE = "更新角色";
    public static final String OPERATION_ADMIN_ROLE_DISABLE = "禁用/启用角色";
    public static final String OPERATION_ADMIN_ROLE_PERMISSION = "授权角色";

    /** 后台菜单列表 */
    public static final String OPERATION_ADMIN_MENU_ADD = "新增菜单";
    public static final String OPERATION_ADMIN_MENU_UPDATE = "更新菜单";
    public static final String OPERATION_ADMIN_MENU_DELETE = "删除菜单";

    /** 前台用户列表 */
    public static final String OPERATION_USER_DISABLE = "禁用/启用用户";
    public static final String OPERATION_USER_EXPORT = "导出用户列表";

    /** 前台角色列表 */
    public static final String OPERATION_ROLE_ADD = "新增角色";
    public static final String OPERATION_ROLE_UPDATE = "更新角色";
    public static final String OPERATION_ROLE_DISABLE = "禁用/启用角色";

    /** 商品分类管理 */
    public static final String OPERATION_GOODS_TYPE_ADD = "新增商品分类";
    public static final String OPERATION_GOODS_TYPE_UPDATE = "更新商品分类";
    public static final String OPERATION_GOODS_TYPE_DISABLE = "禁用/启用商品分类";

    /** SKU分类管理 */
    public static final String OPERATION_SKU_KEY_ADD = "新增SKU分类";
    public static final String OPERATION_SKU_KEY_UPDATE = "更新SKU分类";
    public static final String OPERATION_SKU_KEY_DELETE = "删除SKU分类";

    /** SKU属性管理 */
    public static final String OPERATION_SKU_VALUE_ADD = "新增SKU分类";
    public static final String OPERATION_SKU_VALUE_UPDATE = "更新SKU分类";
    public static final String OPERATION_SKU_VALUE_DELETE = "删除SKU分类";

    /** 商品管理 */
    public static final String OPERATION_GOODS_ADD = "新增商品";
    public static final String OPERATION_GOODS_UPDATE = "更新商品";
    public static final String OPERATION_GOODS_UPLOAD = "上传商品图片";

    /** 商品审核管理 */
    public static final String OPERATION_GOODS_CHECK = "审核商品";

    /** 订单管理 */
    public static final String OPERATION_ORDERS_UPDATE = "更新订单";
    public static final String OPERATION_ORDERS_EXPORT = "导出订单列表";

    /** 退单管理 */
    public static final String OPERATION_RETURN_ORDERS_CHECK = "审核退单申请";
    public static final String OPERATION_RETURN_ORDERS_EXPORT = "导出退单列表";

    /** 支付管理 */
    public static final String OPERATION_PAY_EXPORT = "导出支付列表";

    /** 退款管理 */
    public static final String OPERATION_PAY_RETURN_EXPORT = "导出退款列表";

    /** 日志管理 */
    public static final String OPERATION_LOG_EXPORT = "导出日志列表";

    /** 轮播图管理 */
    public static final String OPERATION_BANNER_ADD = "新增轮播图";
    public static final String OPERATION_BANNER_UPDATE = "更新轮播图";
    public static final String OPERATION_BANNER_UPLOAD = "上传轮播图 - 图片";
    public static final String OPERATION_BANNER_DISABLE = "启用/禁用轮播图";

}
