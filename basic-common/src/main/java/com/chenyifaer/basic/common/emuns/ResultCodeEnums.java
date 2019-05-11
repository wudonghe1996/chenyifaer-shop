package com.chenyifaer.basic.common.emuns;

/**
 * 系统返回值 枚举
 * @Author:wudh
 * @Date: 2019/4/6 17:52
 */
public enum ResultCodeEnums {
    /*********************************************/
    /** 登录成功 */
    SUCCESS_LOGIN("200","登录成功"),
    /** 请求成功 */
    SUCCESS("200", "请求成功"),
    /** 查询成功 */
    SUCCESS_001("200", "查询成功"),
    /** 新增成功 */
    SUCCESS_002("200", "新增成功"),
    /** 更新成功 */
    SUCCESS_003("200", "更新成功"),
    /** 删除成功 */
    SUCCESS_004("200", "删除成功"),
    /** 导出成功 */
    SUCCESS_005("200","导出成功"),
    /** 上传成功 */
    SUCCESS_006("200","上传成功"),
    /** 审核成功 */
    SUCCESS_007("200","审核成功"),
    /** 注册成功 */
    SUCCESS_008("200","注册成功"),

    /*********************************************/
    /** 请求失败 */
    FAIL("10000", "请求失败"),
    /** 查询失败 */
    FAIL_10001("10001","查询失败"),
    /** 新增失败 */
    FAIL_10002("10002","新增失败"),
    /** 更新 */
    FAIL_10003("10003","更新失败"),
    /** 删除 */
    FAIL_10004("10004","删除失败"),
    /** 导出失败 */
    FAIL_10005("10005","导出失败"),
    /** 上传失败 */
    FAIL_10006("10006","上传失败"),
    /** 审核失败 */
    FAIL_10007("10007","审核失败"),
    /** 注册失败 */
    FAIL_10008("10008","注册失败"),

    /** 用户名、密码错误 */
    FAIL_11001("11001", "用户名或密码错误，请重新输入"),
    /** 登录用户被禁用 */
    FAIL_11002("11002","用户被禁用，请联系管理员"),
    /** 密码验证失败 */
    FAIL_11003("11003","两次密码输入不一致，请输入相同的密码"),
    /** 用户已注销 */
    FAIL_11004("11004","用户已注销"),
    /** 用户已存在 */
    FAIL_11005("11005","该用户名已经被注册，请重新注册"),
    /** 当前商品已存在于购物车 */
    FAIL_11006("11006","当前商品已经存在于购物车中，请前往购物车中查看"),

    /*********************************************/
    /** Check验证 */
    /** 请求参数不全 */
    CHECK_001("19001","请求失败，请求参数不全"),
    /** 菜单父ID与主键重复 */
    CHECK_002("19002","传递的父菜单ID与主键重复，操作失败"),
    /** 菜单下拥有子菜单 */
    CHECK_003("19003","菜单下拥有子菜单，无法删除"),
    /** 新增账号已存在 */
    CHECK_004("19004","该账号已经存在，请不要重复添加"),
    /** 新增角色已存在 */
    CHECK_005("19005","该角色已经存在，请不要重复添加"),
    /** 禁用角色正在使用 */
    CHECK_006("19006","当前角色正在被使用，无法禁用"),
    /** 轮播图超出数量限制 */
    CHECK_007("19007","轮播图最大为6个，新增失败")

    ;
    
    ResultCodeEnums(String value, String msg) {
        this.val = value;
        this.msg = msg;
    }

    public String val() {
        return val;
    }

    public String msg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String val;
    private String msg;
}
