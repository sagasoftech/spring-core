package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class InitDestroyMethodMain 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
        context = new ClassPathXmlApplicationContext("Beans.xml");
        
        InitDestroyMethod initDestroyMethod = context.getBean("initDestroyMethod", InitDestroyMethod.class);
        System.out.println("\n>>InitDestroyMethodDemo: "+ initDestroyMethod);
    }
}
