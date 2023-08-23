package com.pavelkostal.courseTicketsBackend;

import com.pavelkostal.courseTicketsBackend.entity.CourseTicket;
import com.pavelkostal.courseTicketsBackend.externalApiCalls.CourseTicketApi;
import com.pavelkostal.courseTicketsBackend.repository.CourseTicketRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@EnableFeignClients
public class CourseTicketsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseTicketsBackendApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(CourseTicketRepository courseTicketRepository, CourseTicketApi courseTicketApi) {
		return args -> {
			courseTicketRepository.saveAll(courseTicketApi.getCourseTickets());
		};
	}
}
