package com.examples.beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorMainApp {
	   public static void main(String[] args) {
	      AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanPostProcessor.xml");

	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      context.registerShutdownHook();
	   }
}
