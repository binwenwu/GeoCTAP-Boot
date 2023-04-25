package com.gis.geoctap.moudle01;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gis.geoctap.moudle01.entity.ChildrenInfoEntity;
import com.gis.geoctap.moudle01.entity.UserEntity;
import com.gis.geoctap.moudle01.service.ChildrenInfoService;
import com.gis.geoctap.moudle01.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;


@SpringBootTest
class Moudle01ApplicationTests {


    @Autowired
    ChildrenInfoService childrenInfoService;
    @Autowired
    UserService userService;


    @Test
    void contextLoads() {


//        ChildrenInfoEntity childrenInfoEntity = new ChildrenInfoEntity();
//        childrenInfoEntity.setId(1);
//        childrenInfoEntity.setChildName("小明");
//        childrenInfoEntity.setSex("男");
//        childrenInfoEntity.setRegisterTime(new Date());
//        childrenInfoEntity.setBirthday(new Date());
//        childrenInfoEntity.setVolunteer("是");
//        childrenInfoEntity.setAnotherInfo("无");
//        childrenInfoEntity.setPlace("北京");
//        childrenInfoEntity.setDisappearancePlace("北京");



//        UserEntity userEntity = new UserEntity();
//        userEntity.setUsername("user1");
//        userEntity.setPassword("123456");
//        userEntity.setSex("男");
//        userEntity.setTelephone("123456789");
//        userEntity.setAddress("北京");
//        userEntity.setAge(18);
//        userEntity.setVolunteer(1);
//        userEntity.setRole("管理员");


//        childrenInfoService.save(childrenInfoEntity);
//        userService.save(userEntity);



        // 查询多个
        List<ChildrenInfoEntity> list = childrenInfoService.list(new QueryWrapper<ChildrenInfoEntity>().eq("id", "1"));
        list.forEach((item)->{
            System.out.println(item);
        });



    }

}
