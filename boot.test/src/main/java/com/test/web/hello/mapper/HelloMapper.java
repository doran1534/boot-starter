package com.test.web.hello.mapper;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("helloMapper")
public interface HelloMapper {
	
	public List<HashMap<String, Object>> selectMember();
	
}
