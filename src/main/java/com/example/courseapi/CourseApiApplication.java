package com.example.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan("com.example.courseapi.topic")
public class CourseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApplication.class, args);
	}

}
