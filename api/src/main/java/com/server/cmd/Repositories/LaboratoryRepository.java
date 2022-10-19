package com.server.cmd.Repositories;

import com.server.cmd.models.Laboratory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

    public interface LaboratoryRepository extends JpaRepository<Laboratory, Long> {
        Optional<Laboratory> findAppointmentByDate (String AppointmentStartDate);
    }