package com.spring.Spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JavaConfigDemo {
	
	@Autowired
	private AutowiredClass autowiredClass;
	public void show()
	{
		System.out.println("inside java config");
		autowiredClass.show();
	}

}
