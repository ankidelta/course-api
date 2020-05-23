package com.course.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CourseAppApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CourseAppApplication.class,args);
	}
}
