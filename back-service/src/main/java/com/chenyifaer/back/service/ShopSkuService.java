package com.chenyifaer.back.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenyifaer.back.entity.po.ShopSkuPO;
import com.chenyifaer.back.entity.vo.GoodsSkuTreeVO;

import java.util.List;

/**
 * 分类管理 - sku分类属性表 服务类
 * @author wudh
 * @since 2019-04-30
 */
public interface ShopSkuService extends IService<ShopSkuPO> {

    /**
     * 查询商品模块SKU树状图
     * @Author:wudh
     * @Date: 2019/5/6 12:38
     */
    List<GoodsSkuTreeVO> getGoodsSkuTree();

}
