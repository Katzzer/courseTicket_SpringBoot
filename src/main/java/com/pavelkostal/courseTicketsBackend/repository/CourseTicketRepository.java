package com.pavelkostal.courseTicketsBackend.repository;

import com.pavelkostal.courseTicketsBackend.entity.CourseTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseTicketRepository extends JpaRepository<CourseTicket, Long> {
}
