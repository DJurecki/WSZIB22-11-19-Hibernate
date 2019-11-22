package com.jurecki.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.jurecki.dao.impl","com.jurecki.service.impl"})
public class AppConfiguration {
}
