package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class HelloWorldMain 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
        context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objHelloWorld = (HelloWorld) context.getBean("helloWorld");
        
        System.out.println("\n>>HelloWorld: ");
        System.out.println(objHelloWorld.getMessage());
        
    }
}
