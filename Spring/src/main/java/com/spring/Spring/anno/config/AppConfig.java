package com.spring.Spring.anno.config;

import java.util.Stack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.Spring.model.Item;
import com.spring.Spring.model.Stock;

@Configuration
public class AppConfig {
	
	@Bean
	public Item getItem() {
		return new Item();
	}
	
	@Bean
	public Stock getStock() {
		return new Stock(getItem());
	}
	
	@Bean
	public Stock getStockAndItemBySetter() {
		Stock stock = new Stock();
		stock.setItem(getItem());
		return stock;
	}

}
