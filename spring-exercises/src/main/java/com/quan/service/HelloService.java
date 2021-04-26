package com.quan.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HelloService implements InitializingBean, BeanPostProcessor {
	public String hello() {
		System.out.println("hehe");
		return "OK";
	}

	@PostConstruct
	void init() {
		System.out.println("HelloService, PostConstruct");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("HelloService, post process before");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("HelloService, post process after");
		return null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("HelloService, InitializingBean afterPropertiesSet");
	}
}
