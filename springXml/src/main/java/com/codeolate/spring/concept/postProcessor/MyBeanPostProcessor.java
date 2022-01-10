package com.codeolate.spring.concept.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("from BeanPostProcessor - method postProcessAfterInitialization. Bean name:"+ beanName);
		return bean;
	}
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("from BeanPostProcessor - method postProcessBeforeInitialization. Bean name:"+ beanName);
		return bean;
	}
}
