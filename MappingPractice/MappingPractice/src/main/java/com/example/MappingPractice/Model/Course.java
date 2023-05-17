package com.example.MappingPractice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course_tbl")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CourseId;
    private String title;
    private String description;
    private String duration;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "Student_courseId")
    private List<Student> Course_studentId;
}
