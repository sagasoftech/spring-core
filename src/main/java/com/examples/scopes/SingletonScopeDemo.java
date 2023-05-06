package com.examples.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.utils.FileResourcesUtils;

public class SingletonScopeDemo {

	private static ApplicationContext context = null;
	
	public static void main(String[] args) {

        context = new FileSystemXmlApplicationContext(
        		FileResourcesUtils.getFileFromResourceAsStream("BeanScope.xml"));
        
        DefineMyScope defineMyScope1 = context.getBean("singletonDemo", DefineMyScope.class);
        defineMyScope1.setMessage("My singleton message is saved");
        System.out.println(defineMyScope1.getMessage());
        
        DefineMyScope defineMyScope2 = context.getBean("singletonDemo", DefineMyScope.class);
        /*
         * Previous message will get printed without setting it
         */
        System.out.println(defineMyScope2.getMessage());        
		
	}
}
