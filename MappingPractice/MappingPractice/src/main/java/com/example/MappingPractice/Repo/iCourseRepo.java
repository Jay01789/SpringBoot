package com.example.MappingPractice.Repo;

import com.example.MappingPractice.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iCourseRepo extends JpaRepository<Course,Integer> {
}
