package com.test.web.hello.service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.web.hello.mapper.HelloMapper;

@Service("helloService")
public class HelloService {

	@Resource(name = "helloMapper")
	private HelloMapper helloMapper;
	
	public List<HashMap<String, Object>> selectMember(){
		return helloMapper.selectMember();
	}
	
}
