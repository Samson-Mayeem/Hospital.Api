package com.example.cmd.Repositories;
import com.example.cmd.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
    Optional<Appointment> findAppointmentByDate (String AppointmentStartDate);
}
