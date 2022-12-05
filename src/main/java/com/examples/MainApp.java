package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MainApp 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
        context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objHelloWorld = (HelloWorld) context.getBean("helloWorld");
        
        System.out.println("\n>>HelloWorld: ");
        System.out.println(objHelloWorld.getMessage());
        
        ConstructorDemo constructorDemo1 = context.getBean("constructorDemo1", ConstructorDemo.class);
        System.out.println("\n>>ConstructorDemo 1: ");
        System.out.println(constructorDemo1.getMessage());
        
        ConstructorDemo constructorDemo2 = context.getBean("constructorDemo2", ConstructorDemo.class);
        System.out.println("\n>>ConstructorDemo 2: ");
        System.out.println(constructorDemo2.getMessage());       
        System.out.println(constructorDemo2.getCount());
        
        LazyInitDemo lazyInitDemo1 = context.getBean("lazyInitDemo1", LazyInitDemo.class);
        System.out.println("\n>>LazyInitDemo 1: ");
        System.out.println(lazyInitDemo1.getMessage());       
        System.out.println(lazyInitDemo1.getCount());
        
        LazyInitDemo lazyInitDemo2 = context.getBean("lazyInitDemo2", LazyInitDemo.class);
        System.out.println("\n>>LazyInitDemo 2: ");
        System.out.println(lazyInitDemo2.getMessage());       
        System.out.println(lazyInitDemo2.getCount());   
        
        
        InitDestroyMethodDemo initDestroyMethodDemo = context.getBean("initDestroyMethodDemo", InitDestroyMethodDemo.class);
        System.out.println("\n>>InitDestroyMethodDemo: "+ initDestroyMethodDemo);
    }
}
