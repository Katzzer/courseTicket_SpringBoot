package com.pavelkostal.courseTicketsBackend.externalApiCalls;

import com.pavelkostal.courseTicketsBackend.entity.CourseTicket;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        name = "CourseTicketApi",
        url = "https://webapi.developers.erstegroup.com/api/csas/public/sandbox/v2/rates/exchangerates?web-api-key=c52a0682-4806-4903-828f-6cc66508329e"
)

public interface CourseTicketApi {

    @GetMapping("")
    List<CourseTicket> getCourseTickets();
}
