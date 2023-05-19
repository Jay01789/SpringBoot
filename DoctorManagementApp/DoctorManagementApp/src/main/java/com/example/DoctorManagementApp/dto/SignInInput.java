package com.example.DoctorManagementApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignInInput {

    private String patient_Email;
    private String patient_Password;
}
