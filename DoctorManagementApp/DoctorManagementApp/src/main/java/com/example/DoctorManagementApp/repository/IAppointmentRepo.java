package com.example.DoctorManagementApp.repository;

import com.example.DoctorManagementApp.model.Appointment;
import com.example.DoctorManagementApp.model.AppointmentKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment, AppointmentKey> {

    public String findByIdAppId(Long id);
}
