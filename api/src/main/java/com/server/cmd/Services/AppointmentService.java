package com.server.cmd.Services;

import com.server.cmd.Repositories.AppointmentRepository;
import com.server.cmd.models.Appointment;

import java.util.List;

public class AppointmentService {
    private AppointmentRepository appointmentRepository;
    public List<Appointment> getAppointment;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }
}
