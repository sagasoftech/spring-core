package com.examples.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorBasedDependencyInjectorMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjection.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}
}
