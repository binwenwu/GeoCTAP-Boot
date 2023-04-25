package com.gis.geoctap.moudle01.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gis.common.utils.PageUtils;
import com.gis.geoctap.moudle01.entity.ChildrenInfoEntity;

import java.util.Map;

/**
 * 
 *
 * @author wubinwen
 * @email ${email}
 * @date 2023-04-25 14:15:49
 */
public interface ChildrenInfoService extends IService<ChildrenInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

