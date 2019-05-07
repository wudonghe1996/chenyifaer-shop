package com.chenyifaer.web.entity.dto;

import lombok.Data;
import lombok.experimental.Accessors;

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
 * 查询商城首页推荐商品 - DTO
 * @Author:wudh
 * @Date: 2019/5/7 22:12
 */
@Data
@Accessors(chain = true)
public class GoodsRecommendedDTO {

    /** 是否推荐 */
    private Integer recommendedStatus;

    /** 商品状态 */
    private Integer status;

    /** 获取商品起始位置 */
    private Integer startSize;

    /** 获取商品结束位置 */
    private Integer endSize;

}
