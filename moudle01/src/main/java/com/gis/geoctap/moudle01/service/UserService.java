package com.gis.geoctap.moudle01.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gis.common.utils.PageUtils;
import com.gis.geoctap.moudle01.entity.UserEntity;

import java.util.Map;

/**
 * 
 *
 * @author wubinwen
 * @email ${email}
 * @date 2023-04-25 14:15:49
 */
public interface UserService extends IService<UserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

