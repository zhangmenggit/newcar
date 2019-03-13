package com.zchx.newcar.api.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zchx.newcar.common.facade.user.UserService;

/**
 * @Auther: 56986
 * @Date: 2019/3/13 11 02
 * @Description:
 */
public class UserControllerImpl implements UserController {

    @Reference
    private UserService userService;

    @Override
    public String sayHello(String name) {
        String result = this.userService.sayHello(name);
        System.out.println(result);
        return result;
    }
}
