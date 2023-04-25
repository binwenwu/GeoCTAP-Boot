package com.gis.geoctap.moudle01.controller;

import com.gis.common.utils.PageUtils;
import com.gis.common.utils.R;
import com.gis.geoctap.moudle01.entity.UserEntity;
import com.gis.geoctap.moudle01.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
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
@RestController
@RequestMapping("moudle01/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("moudle01:user:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{username}")
    @RequiresPermissions("moudle01:user:info")
    public R info(@PathVariable("username") String username){
		UserEntity user = userService.getById(username);

        return R.ok().put("user", user);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("moudle01:user:save")
    public R save(@RequestBody UserEntity user){
		userService.save(user);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("moudle01:user:update")
    public R update(@RequestBody UserEntity user){
		userService.updateById(user);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("moudle01:user:delete")
    public R delete(@RequestBody String[] usernames){
		userService.removeByIds(Arrays.asList(usernames));

        return R.ok();
    }

}
