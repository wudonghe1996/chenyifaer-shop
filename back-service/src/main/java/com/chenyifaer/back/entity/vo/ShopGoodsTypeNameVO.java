package com.chenyifaer.back.entity.vo;

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
 * 分类名称下拉框 - VO
 * @Author:wudh
 * @Date: 2019/4/25 14:45
 */
@Data
@Accessors(chain = true)
public class ShopGoodsTypeNameVO {

    /** 主键 */
    private Integer shopGoodsTypeId;

    /** 分类名称 */
    private String typeName;

}
