package com.example.cmd.models;

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
}
