package com.chenyifaer.basic.common.constant;

/**
 * 系统常量
 * @Author:wudh
 * @Date: 2019/4/6 17:52
 */
public class SystemConstant {

    /************************后台****************************/
    /** 系统后台用户 - 默认密码 */
    public static final String SYSTEM_PASSWORD = "123456";
    /** 轮播图最大数量 */
    public static final Integer BANNER_SIZE = 6;


    /************************前台****************************/
    /** 用户默认昵称 */
    public static final String DEFAULT_USER_NICK_NAME = "游客";

    /** 用户默认头像 */
    public static final String DEFAULT_USER_HEAD_URL = "common/userHead.jpg";

    /** 用户默认角色 - 游客 - 角色ID为：1 */
    public static final Integer DEFAULT_USER_ROLE_ID = 1;

    /** 默认LIMIT查询起始值 */
    public static final Integer LIMIT_START_SIZE = 0;

    /** 根据分类查询商品最大数量 */
    public static final Integer GOODS_TYPE_SIZE = 6;

    /** 根据分类查询推荐商品最大数量 */
    public static final Integer GOODS_RECOMMENDED_TYPE_SIZE = 1;

    /** 查询商品推荐的最大数量 */
    public static final Integer GOODS_RECOMMENDED_SIZE = 3;

    /** 查询商品支持优惠券的最大数量 */
    public static final Integer GOODS_COUPONS_SIZE = 2;

    /** 查询商品支持积分的最大数量 */
    public static final Integer GOODS_INTEGRAL_SIZE = 2;

    /** 根据销量查询商品最大数量 */
    public static final Integer GOODS_SALES_SIZE = 3;

    /** 根据SKU查询商品最大数量 */
    public static final Integer GOODS_SKU_SIZE = 16;

}
