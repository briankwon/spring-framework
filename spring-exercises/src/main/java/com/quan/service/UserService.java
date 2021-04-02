package com.quan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserService {
	@Autowired
	private HelloService helloService;

	@PostConstruct
	public void init() {
		System.out.println("init UserService");
		helloService.hello();
		System.out.println("init UserService success");
	}
}
