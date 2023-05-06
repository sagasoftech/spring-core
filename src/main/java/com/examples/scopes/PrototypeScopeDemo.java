package com.examples.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.utils.FileResourcesUtils;

public class PrototypeScopeDemo {

	private static ApplicationContext context = null;
	
	public static void main(String[] args) {

        context = new FileSystemXmlApplicationContext(
        		FileResourcesUtils.getFileFromResourceAsStream("BeanScope.xml"));
        
        DefineMyScope defineMyScope1 = context.getBean("prototypeDemo", DefineMyScope.class);
        defineMyScope1.setMessage("My singleton message is saved");
        System.out.println("defineMyScope1: " + defineMyScope1.getMessage());
        
        DefineMyScope defineMyScope2 = context.getBean("prototypeDemo", DefineMyScope.class);
        /*
         * Previous message will not get printed
         */
        System.out.println("defineMyScope2: " + defineMyScope2.getMessage());        
		
	}
}
