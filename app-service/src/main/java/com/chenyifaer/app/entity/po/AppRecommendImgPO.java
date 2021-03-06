package com.chenyifaer.app.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 小程序端 - 每日推荐图片表
 * </p>
 *
 * @author wudh
 * @since 2019-07-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_app_recommend_img")
@ApiModel(value="AppRecommendImgPO对象", description="小程序端 - 每日推荐图片表")
public class AppRecommendImgPO extends Model<AppRecommendImgPO> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "recommend_images_id", type = IdType.AUTO)
    private Integer recommendImagesId;

    @ApiModelProperty(value = "最新动态ID")
    private Integer recommendId;

    @ApiModelProperty(value = "图片类型（1：封面 2：内容轮播图）")
    private Integer imgType;

    @ApiModelProperty(value = "图片路径")
    private String url;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return this.recommendImagesId;
    }

}
