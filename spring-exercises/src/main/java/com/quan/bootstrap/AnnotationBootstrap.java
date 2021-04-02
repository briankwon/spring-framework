package com.quan.bootstrap;

import com.quan.config.ApplicationConfig;
import com.quan.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBootstrap {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		HelloService helloService = context.getBean(HelloService.class);
		helloService.hello();
	}
}
