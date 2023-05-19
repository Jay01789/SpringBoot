package com.example.DoctorManagementApp.service;
import com.example.DoctorManagementApp.dto.SignInInput;
import com.example.DoctorManagementApp.dto.SignInOutput;
import com.example.DoctorManagementApp.dto.SignUpInput;
import com.example.DoctorManagementApp.dto.SignUpOutput;
import com.example.DoctorManagementApp.model.AppointmentKey;
import com.example.DoctorManagementApp.model.AuthenticationToken;
import com.example.DoctorManagementApp.model.Doctor;
import com.example.DoctorManagementApp.model.Patient;
import com.example.DoctorManagementApp.repository.IPatientRepo;
import jakarta.xml.bind.DatatypeConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class PatientService {

    @Autowired
    IPatientRepo iPatientRepo;


    @Autowired
    AuthenticationService tokenService;

    @Autowired
    AppointmentService appointmentService;

    @Autowired
    DoctorService doctorService;

    public SignUpOutput signUp(SignUpInput signUpDto) { // get the user details for sign up : signUpDto

        Patient patient = iPatientRepo.findFirstByPatientEmail(signUpDto.getUserEmail());//alternative : exist by true/false

        if(patient != null)
        {
            throw new IllegalStateException("Patient already exists!!!!...sign in instead");
        }


        //encryption
        String encryptedPassword = null;
        try {
            encryptedPassword = encryptPassword(signUpDto.getUserPassword());//takes  a string and encrypts it...
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();

        }

        //save the user

        patient = new Patient(signUpDto.getUserFirstName(),
                signUpDto.getUserLastName(),signUpDto.getUserEmail(),
                encryptedPassword, signUpDto.getUserContact());

        iPatientRepo.save(patient);

        //token creation and saving

        AuthenticationToken token = new AuthenticationToken(patient);

        tokenService.saveToken(token);

        return new SignUpOutput("Patient registered","Patient created successfully");


    }

    private String encryptPassword(String userPassword) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(userPassword.getBytes());
        byte[] digested =  md5.digest();

        String hash = DatatypeConverter.printHexBinary(digested);
        return hash;
    }


    public SignInOutput signIn(SignInInput signInDto) {

        //get email

        Patient patient = iPatientRepo.findFirstByPatientEmail(signInDto.getPatient_Email());

        if(patient == null)
        {
            throw new IllegalStateException("User invalid!!!!...sign up instead");
        }

        //encrypt the password

        String encryptedPassword = null;

        try {
            encryptedPassword = encryptPassword(signInDto.getPatient_Password());
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();

        }



        //match it with database encrypted password

        boolean isPasswordValid = encryptedPassword.equals(patient.getPatientPassword());

        if(!isPasswordValid)
        {
            throw new IllegalStateException("User invalid!!!!...sign up instead");
        }

        //figure out the token

        AuthenticationToken authToken = tokenService.getToken(patient);


        return new SignInOutput("Authentication Successfull !!!",authToken.getToken());


    }

    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    public void cancelAppointment(AppointmentKey key) {

        appointmentService.cancelAppointment(key);

    }
}
