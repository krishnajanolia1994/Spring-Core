package com.spring.Spring.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollectionConfig {
	@Bean
	public List<String> getList(){
		return Arrays.asList("a","b");
	}
}
