package com.zchx.newcar.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zchx.newcar.common.facade.user.UserService;

/**
 * @Auther: 56986
 * @Date: 2019/3/13 10 54
 * @Description:
 */
@Service
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello(String name) {

        System.out.println( name + " :  hello !!!!!!");

        return name + " : hello !!!!!! ";
    }
}
