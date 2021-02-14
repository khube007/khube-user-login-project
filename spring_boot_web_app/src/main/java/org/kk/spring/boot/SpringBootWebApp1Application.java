package org.kk.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.kk.spring.boot")
public class SpringBootWebApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApp1Application.class, args);
	}

}
