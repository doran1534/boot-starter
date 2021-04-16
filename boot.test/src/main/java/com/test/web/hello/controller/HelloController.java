package com.test.web.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@GetMapping("/main")
	public String main() {
		System.out.println("jenkins 테스트입니다.");
		System.out.println("jenkins 테스트입니다.");
		System.out.println("jenkins 테스트입니다.");
		System.out.println("jenkins 테스트입니다.");
		System.out.println("jenkins 테스트입니다.");
		System.out.println("jenkins 테스트입니다.");
		System.out.println("jenkins 테스트입니다.");
		System.out.println("jenkins 테스트입니다.");
		System.out.println("jenkins 테스트입니다.");
		
		
		
		
		
		
		
		return "hello/main";
		
	}
}
