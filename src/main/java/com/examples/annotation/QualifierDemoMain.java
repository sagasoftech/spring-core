package com.examples.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierDemoMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Annotation.xml");

		Profile profile = (Profile) context.getBean("profile");
		profile.printAge();
		profile.printName();
	}
}
