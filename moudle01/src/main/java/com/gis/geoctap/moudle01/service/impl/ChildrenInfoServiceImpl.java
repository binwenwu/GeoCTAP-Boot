package com.gis.geoctap.moudle01.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gis.common.utils.PageUtils;
import com.gis.common.utils.Query;
import com.gis.geoctap.moudle01.dao.ChildrenInfoDao;
import com.gis.geoctap.moudle01.entity.ChildrenInfoEntity;
import com.gis.geoctap.moudle01.service.ChildrenInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("childrenInfoService")
public class ChildrenInfoServiceImpl extends ServiceImpl<ChildrenInfoDao, ChildrenInfoEntity> implements ChildrenInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ChildrenInfoEntity> page = this.page(
                new Query<ChildrenInfoEntity>().getPage(params),
                new QueryWrapper<ChildrenInfoEntity>()
        );

        return new PageUtils(page);
    }

}
