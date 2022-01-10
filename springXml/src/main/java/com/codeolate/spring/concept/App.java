package com.codeolate.spring.concept;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeolate.spring.concept.impl.Doctor;

public class App {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook(); //Only used for Desktop application not web or enterprise app
		Doctor doctor = context.getBean(Doctor.class);
		System.out.println("Printing Doctor pojo details after getBean -->"+doctor.toString());
		doctor.setDoctorName("Nirmala");
		Doctor doctor2 = context.getBean(Doctor.class);
		System.out.println("if doctor name changed then singleton?::"+doctor2);
	}

}
