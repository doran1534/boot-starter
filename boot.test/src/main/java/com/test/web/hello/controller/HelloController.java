package com.test.web.hello.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.web.hello.service.HelloService;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@Resource(name = "helloService")
	private HelloService helloService;

	@GetMapping("/main")
	public String main(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<HashMap<String, Object>> listData = new ArrayList<HashMap<String,Object>>();
		listData = helloService.selectMember();
		System.out.println(listData.toString());
		System.out.println(listData);
		
		return "hello/main";
	}
}
