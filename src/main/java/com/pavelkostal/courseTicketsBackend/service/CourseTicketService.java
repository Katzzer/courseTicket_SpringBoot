package com.pavelkostal.courseTicketsBackend.service;

import com.pavelkostal.courseTicketsBackend.entity.CourseTicket;
import com.pavelkostal.courseTicketsBackend.externalApiCalls.CourseTicketApi;
import com.pavelkostal.courseTicketsBackend.repository.CourseTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseTicketService {
    
    CourseTicketApi courseTicketApi;
    CourseTicketRepository courseTicketRepository;

    @Autowired
    public CourseTicketService(CourseTicketApi courseTicketApi, CourseTicketRepository courseTicketRepository) {
        this.courseTicketApi = courseTicketApi;
        this.courseTicketRepository = courseTicketRepository;
    }

    public List<CourseTicket> getTicketsFromPublicApi() {
        return courseTicketApi.getCourseTickets();
    }

    public List<CourseTicket> getTicketsFromDb() {
        return courseTicketRepository.findAll();
    }
}
