package com.example.MappingPractice.Repo;

import com.example.MappingPractice.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iStudentRepo extends JpaRepository<Student,Integer> {
}
