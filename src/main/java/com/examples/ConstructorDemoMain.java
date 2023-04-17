package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDemoMain {

    private static ApplicationContext context;

	public static void main( String[] args )
    {
        context = new ClassPathXmlApplicationContext("Beans.xml");
        ConstructorDemo constructorDemo1 = context.getBean("constructorDemo1", ConstructorDemo.class);
        System.out.println("\n>>ConstructorDemo 1: ");
        System.out.println(constructorDemo1.getMessage());
        
        ConstructorDemo constructorDemo2 = context.getBean("constructorDemo2", ConstructorDemo.class);
        System.out.println("\n>>ConstructorDemo 2: ");
        System.out.println(constructorDemo2.getMessage());       
        System.out.println(constructorDemo2.getCount());
    }
	
}
