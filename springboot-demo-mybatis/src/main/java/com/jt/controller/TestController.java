package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;

@RestController
public class TestController {
	@Autowired
	private UserMapper usermapper;
  @RequestMapping("/user")
  public List<User> test(){
	return usermapper.findAll();
	  
  }
}
