package com.example.JobSearchPortalApp.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class JobSearch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer job_id ;
    @NotEmpty
    private String title;
    private String description;
    private String location;
    private Double salary;
    @NotEmpty
    private String companyName;
    @NotEmpty
    private String employerName;
    @Size(min = 10,max = 12)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private JobType jobType; // 0,1,2,3
}
