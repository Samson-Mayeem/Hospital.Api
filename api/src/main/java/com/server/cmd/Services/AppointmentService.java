package com.server.cmd.Services;

import org.springframework.stereotype.Service;

import com.server.cmd.Repositories.AppointmentRepository;
import com.server.cmd.models.Appointment;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.TimeZone;


@Service
public class AppointmentService {
    private AppointmentRepository appointmentRepository;
    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public List<Appointment> getAppointments() {
        return appointmentRepository.findAll();
    }

    public void setAppointment(Appointment appointment) {
        Optional<Appointment> appointmentOptional = appointmentRepository.findAppointmentByDate(appointment.getNameOfAppointment());
        if (appointmentOptional.isPresent()){
            throw new IllegalStateException("appointment already exists");
        }
        appointmentRepository.save(appointment);
        System.out.println(appointment);
    }
    public void appointmentDelete(Long id) {
        boolean exists = appointmentRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException("user with Id" + id + "does not exist");
        }
        appointmentRepository.deleteById(id);
    }

    public void updateAppointment(Long id, String nameOfAppointment, TimeZone inputTimeZone, String appointmentDescription, String appointmentStartDate, String appointEndDate) {
        Appointment appointment = appointmentRepository.findById(id).orElseThrow( ()->new IllegalStateException("product with id"+ id + "does not exist"));
        if(nameOfAppointment != null && nameOfAppointment.length()>0 && !Objects.equals(appointment.getNameOfAppointment(), nameOfAppointment));
        {
            appointment.setNameOfAppointment(nameOfAppointment);
        }
        if(inputTimeZone != null && inputTimeZone.useDaylightTime() && !Objects.equals(appointment.getInputTimeZone(), inputTimeZone));
        {
            appointment.setInputTimeZone(inputTimeZone);
        }
        if(appointmentDescription != null && appointmentDescription.length()>0 && !Objects.equals(appointment.getAppointmentDescription(), appointEndDate));
        {
            appointment.setAppointmentDescription(appointmentDescription);
        }
        if(appointmentStartDate != null && appointmentStartDate.length()>0 && !Objects.equals(appointment.getAppointmentStartDate(), appointmentStartDate));
        {
            appointment.setAppointmentStartDate(appointmentStartDate);
        }
        if(appointEndDate != null && appointEndDate.length()>0 && !Objects.equals(appointment.getAppointEndDate(), appointEndDate));
        {
            appointment.setAppointEndDate(appointEndDate);
        }
    }
}
