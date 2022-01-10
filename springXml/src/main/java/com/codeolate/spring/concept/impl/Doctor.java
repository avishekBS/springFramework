package com.codeolate.spring.concept.impl;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Doctor implements HospitalService,ApplicationContextAware, BeanNameAware,
	InitializingBean, DisposableBean{
	
	private String doctorName;
	
	private int doctorId;
	
	@NonNull
	private Department department;
	
	private Hospital hospital;
	
	private List<Nurse> listOfNurse;
	
	private Patient patient;
	
	ApplicationContext applicationContext = null;

	private String beanName;
	
	public void patientDetails() {
		System.out.println("Doctor is checking the pateint details");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("called from application context Aware...");
		this.applicationContext = applicationContext;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
		System.out.println("Bean name aware -->"+beanName);
	}

	public void destroy() throws Exception {
		System.out.println("Destroy bean called after implementing DisposableBean");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Init bean called after implementing InitializingBean");
	}
	public void myInit() throws Exception {
		System.out.println("custom init method called from Bike class. Bean Name:"+beanName);
	}

	public void myCleanUp() throws Exception {
		System.out.println("custom destroy method called from Bike class Bean Name:"+beanName);
	}
	public void globalBeansInit() throws Exception {
		System.out.println("global BeansInit method called from Bike class Bean Name:"+beanName);
	}

	public void globalBeansDispose() throws Exception {
		System.out.println("global Beansdestroy method called from Bike class Bean Name:"+beanName);
	}
}
