package com.examples.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanInjection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjection.xml");
		TextEditor3 te = (TextEditor3) context.getBean("textEditorInnerBean");
		te.spellCheck();
	}
}
