package com.quan.bootstrap;

import com.quan.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLBootstrap {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		HelloService helloService = context.getBean(HelloService.class);
		helloService.hello();
	}
}
