package com.zchx.newcar.api.controller.user;


import com.alibaba.dubbo.config.annotation.Reference;
import com.zchx.newcar.common.domain.user.UserEntity;
import com.zchx.newcar.common.facade.user.UserService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zzm
 * @since 2019-03-14
 */
@RestController
public class UserControllerImpl implements UserController {

    @Reference
    private UserService userService;


    @Override
    public String sayHello(String name) {
        String value = userService.sayHello(name);
        return value;
    }

    @Override
    public List<UserEntity> listUsers() {
        List<UserEntity> userEntities = this.userService.list();
        return userEntities;
    }
}
