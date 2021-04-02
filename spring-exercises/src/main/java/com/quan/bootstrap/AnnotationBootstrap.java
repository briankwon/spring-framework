package com.quan.bootstrap;

import com.quan.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBootstrap {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	}
}
