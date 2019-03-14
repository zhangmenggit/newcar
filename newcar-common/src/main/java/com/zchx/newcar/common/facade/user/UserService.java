package com.zchx.newcar.common.facade.user;

import com.zchx.newcar.common.domain.user.UserEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zzm
 * @since 2019-03-14
 */
public interface UserService extends IService<UserEntity> {

    String sayHello (String name);

}
