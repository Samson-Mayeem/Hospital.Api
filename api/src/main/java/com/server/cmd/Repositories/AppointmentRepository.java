package com.server.cmd.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.server.cmd.models.Appointment;

import java.util.Optional;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
    Optional<Appointment> findAppointmentByDate (String AppointmentStartDate);
}
