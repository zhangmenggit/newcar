package com.zchx.newcar.user;

import com.zchx.newcar.common.domain.user.UserEntity;
import com.zchx.newcar.user.mapper.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewcarUserApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	public void contextLoads() {

		System.out.println("------ selectAll method test --------");
		List<UserEntity> userDOS = userDao.selectList(null);
		Assert.assertEquals(2,userDOS.size());
		userDOS.forEach(System.out::println);

	}

}
