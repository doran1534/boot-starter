package com.test.web.hello.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@GetMapping("/main")
	public String main(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "hello/main";
		
	}
}
