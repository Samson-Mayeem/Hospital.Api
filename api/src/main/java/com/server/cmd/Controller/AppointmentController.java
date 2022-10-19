package com.server.cmd.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.server.cmd.Services.AppointmentService;
import com.server.cmd.models.Appointment;

import java.util.List;
import java.util.TimeZone;

@RestController
@RequestMapping(path ="api/v1/appointments/")
public class AppointmentController {
    private AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }
    @GetMapping
    public List<Appointment> getAppointments(){
        return appointmentService.getAppointments();
    }

    @PostMapping
    public void setAppointment(@RequestBody Appointment appointment){
        appointmentService.setAppointment(appointment);
    }
    @DeleteMapping(path = "{id}")
    public  void deleteAppointment(@PathVariable Long id){
        appointmentService.appointmentDelete(id);
    }
    @PutMapping(path = "{id}")
    public void  updateAppointment(
            @PathVariable ("id") Long id,
            @PathVariable(required = false) String NameOfAppointment,
            @PathVariable(required = false) TimeZone InputTimeZone,
            @PathVariable(required = false) String AppointmentDescription,
            @PathVariable(required = false) String AppointmentStartDate,
            @PathVariable(required = false) String AppointEndDate
    ){
        appointmentService.updateAppointment(id, NameOfAppointment, InputTimeZone, AppointmentDescription,AppointmentStartDate,AppointEndDate);
    }
}
