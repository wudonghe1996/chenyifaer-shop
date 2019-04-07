package com.chenyifaer.back.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenyifaer.back.entity.dto.LogDTO;
import com.chenyifaer.back.entity.po.LogPO;
import com.chenyifaer.back.entity.vo.LogVO;

import java.util.List;

/**
 * <p>
 * 系统管理 - 系统日志表 Mapper 接口
 * </p>
 *
 * @author wudh
 * @since 2019-04-07
 */
public interface LogDao extends BaseMapper<LogPO> {

    /**
     * 查询操作日志列表
     * @Author:wudh
     * @Date: 2019/4/7 20:26
     */
    List<LogVO> getList(LogDTO logDTO);

}
