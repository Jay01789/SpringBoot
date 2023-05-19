package com.example.DoctorManagementApp.repository;

import com.example.DoctorManagementApp.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepo extends JpaRepository<Doctor, Long> {


    Doctor findByDoctorId(Long docId);
}
