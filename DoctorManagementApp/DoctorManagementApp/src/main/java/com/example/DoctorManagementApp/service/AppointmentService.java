package com.example.DoctorManagementApp.service;


import com.example.DoctorManagementApp.model.Appointment;
import com.example.DoctorManagementApp.model.AppointmentKey;
import com.example.DoctorManagementApp.repository.IAppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    @Autowired
    IAppointmentRepo appointmentRepo;

    public void bookAppointment(Appointment appointment) {
        appointmentRepo.save(appointment);
    }

    public void cancelAppointment(AppointmentKey key) {
        appointmentRepo.deleteById(key);
    }
}
