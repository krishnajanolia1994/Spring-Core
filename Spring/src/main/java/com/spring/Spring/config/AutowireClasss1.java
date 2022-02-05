package com.spring.Spring.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("AutowireClasss1")
@Primary
public class AutowireClasss1 implements QualifierInerface{

	public void Show() {
		System.out.println("AutowireClasss1");
	}

}
