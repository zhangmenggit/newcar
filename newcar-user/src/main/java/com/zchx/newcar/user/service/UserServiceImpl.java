package com.zchx.newcar.user.service;

import com.zchx.newcar.common.domain.user.UserEntity;
import com.zchx.newcar.user.mapper.UserDao;
import com.zchx.newcar.common.facade.user.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zzm
 * @since 2019-03-14
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

    @Override
    public String sayHello(String name) {

        return name + ": hello !!!!!!!";
    }
}
