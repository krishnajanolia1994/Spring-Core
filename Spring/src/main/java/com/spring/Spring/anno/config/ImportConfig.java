package com.spring.Spring.anno.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AnnoConfig.class})
public class ImportConfig {

}
