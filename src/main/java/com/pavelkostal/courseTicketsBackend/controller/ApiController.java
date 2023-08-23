package com.pavelkostal.courseTicketsBackend.controller;

import com.pavelkostal.courseTicketsBackend.entity.CourseTicket;
import com.pavelkostal.courseTicketsBackend.service.CourseTicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    public List<CourseTicket> getCourseTickets(@RequestParam(required = false) Boolean usedb) {
        if (usedb != null && usedb) {
            return courseTicketService.getTicketsFromDb();
        }
        return courseTicketService.getTicketsFromPublicApi();
    }
}
