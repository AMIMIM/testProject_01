package com.adrian.project01;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Project01Application {

	public static void main(String[] args) {
		
		ApplicationContext ac = SpringApplication.run(Project01Application.class, args);
		System.out.println("Inspect bean provided by Spring Boot: ");
		String[] beanNames = ac.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
	}
}
