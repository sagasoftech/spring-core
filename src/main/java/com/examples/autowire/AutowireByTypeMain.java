package com.examples.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByTypeMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowireBean.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor2");
		te.getName();
		te.spellCheck();
	}
}
