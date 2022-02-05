package com.spring.Spring.config;

import org.springframework.stereotype.Component;

@Component("AutowireClasss2")
public class AutowireClasss2 implements QualifierInerface{

	public void Show() {
		System.out.println("AutowireClasss2");
	}

}
