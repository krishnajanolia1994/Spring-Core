package com.spring.Spring.di;

import org.springframework.stereotype.Component;

@Component
public class AutowireDemo {
	private Inner inner;

	public Inner getInner() {
		return inner;
	}

	public void setInner(Inner inner) {
		this.inner = inner;
	}
	
	public void show()
	{
		inner.show();
	}

}
