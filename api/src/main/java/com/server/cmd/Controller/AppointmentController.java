package com.server.cmd.Controller;


import com.server.cmd.Services.AppointmentService;
import com.server.cmd.models.Appointment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/appointments/")
public class AppointmentController {
    private AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }
    @GetMapping
    public List<Appointment> getAppointments(){
        return appointmentService.getAppointment;
    }
}
