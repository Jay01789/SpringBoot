package com.example.DoctorManagementApp.repository;

import com.example.DoctorManagementApp.model.Patient;;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepo extends JpaRepository<Patient, Long> {

    Patient findFirstByPatientEmail(String userEmail);
}
