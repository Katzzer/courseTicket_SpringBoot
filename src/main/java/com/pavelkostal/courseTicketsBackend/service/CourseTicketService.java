package com.pavelkostal.courseTicketsBackend.service;

import com.pavelkostal.courseTicketsBackend.entity.CourseTicket;
import com.pavelkostal.courseTicketsBackend.externalApiCalls.CourseTicketApi;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
//@RequiredArgsConstructor
public class CourseTicketService {
    
    CourseTicketApi courseTicketApi;

    @Autowired
    public CourseTicketService(CourseTicketApi courseTicketApi) {
        this.courseTicketApi = courseTicketApi;
    }

    public ArrayList<CourseTicket> getTicketsFromPublicApi() {
        return courseTicketApi.getCourseTickets();
    }
}
