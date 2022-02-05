package com.spring.Spring.model;

public class Stock {
	
	private Item item;
	
	public void show() {
		System.out.println("inside stock");
	}
	
	public Stock() {}

	public Stock(Item item) {
		super();
		this.item = item;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	

}
