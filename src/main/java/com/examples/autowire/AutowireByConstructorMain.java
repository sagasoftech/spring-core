package com.examples.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByConstructorMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowireBean.xml");
		TextEditorConstructor te = (TextEditorConstructor) context.getBean("textEditorConstructor");
		te.getName();
		te.spellCheck();
	}
}
