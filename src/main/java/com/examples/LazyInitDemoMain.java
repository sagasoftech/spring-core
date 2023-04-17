package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyInitDemoMain {

    private static ApplicationContext context;

	public static void main( String[] args )
    {
        context = new ClassPathXmlApplicationContext("Beans.xml");
        LazyInitDemo lazyInitDemo1 = context.getBean("lazyInitDemo1", LazyInitDemo.class);
        System.out.println("\n>>LazyInitDemo 1: ");
        System.out.println(lazyInitDemo1.getMessage());       
        System.out.println(lazyInitDemo1.getCount());
        
        LazyInitDemo lazyInitDemo2 = context.getBean("lazyInitDemo2", LazyInitDemo.class);
        System.out.println("\n>>LazyInitDemo 2: ");
        System.out.println(lazyInitDemo2.getMessage());       
        System.out.println(lazyInitDemo2.getCount());   
        
    }
	
}
