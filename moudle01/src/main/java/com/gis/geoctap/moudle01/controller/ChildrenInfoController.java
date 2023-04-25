package com.gis.geoctap.moudle01.controller;

import com.gis.common.utils.PageUtils;
import com.gis.common.utils.R;
import com.gis.geoctap.moudle01.entity.ChildrenInfoEntity;
import com.gis.geoctap.moudle01.service.ChildrenInfoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 *
 *
 * @author wubinwen
 * @email ${email}
 * @date 2023-04-25 14:15:49
 */
@RefreshScope
@RestController
@RequestMapping("moudle01/childreninfo")
public class ChildrenInfoController {
    @Autowired
    private ChildrenInfoService childrenInfoService;



    // TODO 配置中心测试
    @Value("${moudle01.user.name}")
    private String name;
    @Value("${moudle01.user.age}")
    private Integer age;
    @RequestMapping("/test")
    public R test(){
        return R.ok().put("name", name).put("age", age);
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("moudle01:childreninfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = childrenInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("moudle01:childreninfo:info")
    public R info(@PathVariable("id") Integer id){
		ChildrenInfoEntity childrenInfo = childrenInfoService.getById(id);

        return R.ok().put("childrenInfo", childrenInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("moudle01:childreninfo:save")
    public R save(@RequestBody ChildrenInfoEntity childrenInfo){
		childrenInfoService.save(childrenInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("moudle01:childreninfo:update")
    public R update(@RequestBody ChildrenInfoEntity childrenInfo){
		childrenInfoService.updateById(childrenInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("moudle01:childreninfo:delete")
    public R delete(@RequestBody Integer[] ids){
		childrenInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
