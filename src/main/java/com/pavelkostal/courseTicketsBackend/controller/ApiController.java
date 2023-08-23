package com.pavelkostal.courseTicketsBackend.controller;

import com.pavelkostal.courseTicketsBackend.entity.CourseTicket;
import com.pavelkostal.courseTicketsBackend.service.CourseTicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController()
@RequestMapping("api/v1/course-tickets")
//@RequiredArgsConstructor
@CrossOrigin()
public class ApiController {
    
    CourseTicketService courseTicketService;

    @Autowired
    public ApiController(CourseTicketService courseTicketService) {
        this.courseTicketService = courseTicketService;
    }

    @GetMapping
    public ArrayList<CourseTicket> getCourseTickets() {
        courseTicketService.getTicketsFromPublicApi();
        return null;
    }
}
