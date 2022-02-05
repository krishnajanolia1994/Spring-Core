package com.spring.Spring.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AutowiredClass {
	
	@Autowired
	@Qualifier("AutowireClasss2")
	QualifierInerface autowireClasss2;
	
	@Autowired
	QualifierInerface autowireClasss1;
	
	@Autowired
	private List<String> getList;

	
	public void show()
	{
		autowireClasss2.Show();
		autowireClasss1.Show();
		System.out.println("AutowiredClass");
		
		System.out.println("collection Autowire");

		for(String str:getList) {
			System.out.println("collectin "+ str);
		}
	}

}
