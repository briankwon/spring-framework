package com.quan.service;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
	public String hello() {
		System.out.println("hehe");
		return "OK";
	}
}
