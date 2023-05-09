package com.examples.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

class Foo {
	public void init() {
		// initialization logic
	}

	public void cleanup() {
		// destruction logic
	}
}

@Configuration
public class LifecycleCallback {
   @Bean(initMethod = "init", destroyMethod = "cleanup" )
   @Scope("prototype")
   public Foo foo() {
      return new Foo();
   }
}