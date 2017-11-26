package com.adrian.project01;

import java.io.File;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Project01Application {

	public static String ROOT = "upload-dir"; 
	
	public static void main(String[] args) {
		
		ApplicationContext ac = SpringApplication.run(Project01Application.class, args);
		System.out.println("########	TEST PROJECT JUST STARTED!!!!!!!!!!		#########");
		/*
		String[] beanNames = ac.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
		*/
	}
	
	 @Bean
	    CommandLineRunner init() {
	        return (String[] args) -> {
	            new File(ROOT).mkdir();
	        };
	} 
}
