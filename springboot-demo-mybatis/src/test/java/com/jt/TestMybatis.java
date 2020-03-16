package com.jt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jt.mapper.UserMapper;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMybatis {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testFind() {
		
		System.out.println(userMapper.findAll());
	}
}
