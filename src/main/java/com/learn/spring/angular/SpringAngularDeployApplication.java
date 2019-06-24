package com.learn.spring.angular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringAngularDeployApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularDeployApplication.class, args);
	}

}
