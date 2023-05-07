package com.examples.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterBasedDependencyInjection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjection.xml");

		TextEditor2 te2 = (TextEditor2) context.getBean("textEditor2");
		te2.spellCheck();
	}
}
