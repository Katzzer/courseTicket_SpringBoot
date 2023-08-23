package com.pavelkostal.courseTicketsBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CourseTicketsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseTicketsBackendApplication.class, args);
	}

}
