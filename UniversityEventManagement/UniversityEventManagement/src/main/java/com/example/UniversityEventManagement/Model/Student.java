package com.example.UniversityEventManagement.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private Integer studentId;
    @Pattern(regexp = "[A-Z][a-z]*")
    private String firstName;
    private String lastName;


    @Min(value = 18)
    @Max(value = 25)
    private Integer age;
    @Column(name = "department")
    @Enumerated(EnumType.STRING)
    private DepartmentType department; //1,2,3,4

}
