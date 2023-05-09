package com.examples.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredDemoMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Annotation.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");

		te.spellCheck();
	}
}
