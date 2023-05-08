package com.example.EmployeeAddress.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_id ;
    private String first_name;
    private String last_name;

    @JsonIgnore
    @OneToOne(cascade =  CascadeType.ALL )
    private Address address;
}
