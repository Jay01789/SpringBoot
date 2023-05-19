package com.example.DoctorManagementApp.repository;

import com.example.DoctorManagementApp.model.AuthenticationToken;
import com.example.DoctorManagementApp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthenticationToken, Long> {


    AuthenticationToken findByPatient(Patient patient);

    AuthenticationToken findFirstByToken(String token);
}
