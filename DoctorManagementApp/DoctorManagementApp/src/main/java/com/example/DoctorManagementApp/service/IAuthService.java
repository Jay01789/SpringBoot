package com.example.DoctorManagementApp.service;


import com.example.DoctorManagementApp.model.AuthenticationToken;
import com.example.DoctorManagementApp.model.Patient;

public interface IAuthService {

    void saveToken(AuthenticationToken token);
    AuthenticationToken getToken(Patient patient);
    boolean authenticate(String userEmail, String token);


}
