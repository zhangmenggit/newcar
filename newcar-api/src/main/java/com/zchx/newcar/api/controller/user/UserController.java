package com.zchx.newcar.api.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 56986
 * @Date: 2019/3/13 11 00
 * @Description:
 */
@RestController
public interface UserController {

    @GetMapping(value = "/sayHello")
    String sayHello (String name);

}
