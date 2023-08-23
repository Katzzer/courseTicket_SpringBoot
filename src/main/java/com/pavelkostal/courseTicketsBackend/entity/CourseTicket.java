package com.pavelkostal.courseTicketsBackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "CourseValue")
@Table(name = "course-value")
@Getter
@Setter
public class CourseTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    
}
