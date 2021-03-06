package com.chenyifaer.web.entity.vo;
/**
 *     _____ _            __     ___ ______                ________ ____ ______ ____
 *	  / ____| |           \ \   / (_)  ____|              / /____  |___ \____  |___ \
 *	 | |    | |__   ___ _ _\ \_/ / _| |__ __ _  ___ _ __ / /_   / /  __) |  / /  __) |
 *	 | |    | '_ \ / _ \ '_ \   / | |  __/ _` |/ _ \ '__| '_ \ / /  |__ <  / /  |__ <
 *	 | |____| | | |  __/ | | | |  | | | | (_| |  __/ |  | (_) / /   ___) |/ /   ___) |
 *	  \_____|_| |_|\___|_| |_|_|  |_|_|  \__,_|\___|_|   \___/_/   |____//_/   |____/
 *
 */

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 商品分类选项卡 - 二级分类 - VO
 * @Author:wudh
 * @Date: 2019/5/7 21:36
 */

@Data
@Accessors(chain = true)
public class GoodsTypeTwoVO {

    /** 主键 */
    private Integer twoShopGoodsTypeId;

    /** 二级分类名称 */
    private String twoTypeName;

    /** 三级分类集合 */
    private List<GoodsTypeThreeVO> threeTypeList;

}
