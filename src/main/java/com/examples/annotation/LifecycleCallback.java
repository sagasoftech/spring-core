package com.examples.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
   public Foo foo() {
      return new Foo();
   }
}