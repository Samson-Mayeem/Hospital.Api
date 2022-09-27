package com.server.cmd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.TimeZone;


@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appointment_sequence")
    private Long Id;
    private String NameOfAppointment;
    private TimeZone InputTimeZone;
    private String AppointmentDescription;
    private String AppointmentStartDate;
    private String AppointEndDate;
    public Appointment() {
    }
    public Appointment(
        String nameOfAppointment, 
        TimeZone inputTimeZone, 
        String appointmentDescription,
        String appointmentStartDate, 
        String appointEndDate) {

        NameOfAppointment = nameOfAppointment;
        InputTimeZone = inputTimeZone;
        AppointmentDescription = appointmentDescription;
        AppointmentStartDate = appointmentStartDate;
        AppointEndDate = appointEndDate;
        
    }
    public Appointment(Long id, String nameOfAppointment, TimeZone inputTimeZone, String appointmentDescription,
            String appointmentStartDate, String appointEndDate) {
        Id = id;
        NameOfAppointment = nameOfAppointment;
        InputTimeZone = inputTimeZone;
        AppointmentDescription = appointmentDescription;
        AppointmentStartDate = appointmentStartDate;
        AppointEndDate = appointEndDate;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getNameOfAppointment() {
        return NameOfAppointment;
    }
    public void setNameOfAppointment(String nameOfAppointment) {
        NameOfAppointment = nameOfAppointment;
    }
    public TimeZone getInputTimeZone() {
        return InputTimeZone;
    }
    public void setInputTimeZone(TimeZone inputTimeZone) {
        InputTimeZone = inputTimeZone;
    }
    public String getAppointmentDescription() {
        return AppointmentDescription;
    }
    public void setAppointmentDescription(String appointmentDescription) {
        AppointmentDescription = appointmentDescription;
    }
    public String getAppointmentStartDate() {
        return AppointmentStartDate;
    }
    public void setAppointmentStartDate(String appointmentStartDate) {
        AppointmentStartDate = appointmentStartDate;
    }
    public String getAppointEndDate() {
        return AppointEndDate;
    }
    public void setAppointEndDate(String appointEndDate) {
        AppointEndDate = appointEndDate;
    }
}
