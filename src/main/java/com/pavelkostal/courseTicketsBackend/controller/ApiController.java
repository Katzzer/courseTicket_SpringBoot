package com.pavelkostal.courseTicketsBackend.controller;

import com.pavelkostal.courseTicketsBackend.entity.CourseTicket;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController()
@RequestMapping("api/v1/course-tickets")
@AllArgsConstructor
@CrossOrigin()
public class ApiController {
    
    @GetMapping
    public ArrayList<CourseTicket> getCourseTickets() {
        return null;
    }
}
