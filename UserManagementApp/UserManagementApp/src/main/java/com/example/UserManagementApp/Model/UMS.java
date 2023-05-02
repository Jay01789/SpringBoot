package com.example.UserManagementApp.Model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UMS {
    @NotBlank
    @NotNull
    private String userId;
    @NotEmpty
    private String userName;

    private String dob;
    @Email
    private String email;
    @Size(min = 10,max = 12)
    @Pattern(regexp = "^[0-9]+$")
    private String phoneNumber;

    private String date;
    private String time;

}

