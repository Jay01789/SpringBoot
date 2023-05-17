package com.example.MappingPractice.Service;

import com.example.MappingPractice.Model.Course;
import com.example.MappingPractice.Repo.iCourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    iCourseRepo  courseRepo;


    public void save(Course course) {
        courseRepo.save(course);
    }

    public List<Course> getAll() {
       return courseRepo.findAll();
    }

    public void update(Integer id, Course course) {

        Course res = courseRepo.findById(id).get();
        res.setTitle(course.getTitle());
        res.setDuration(course.getDuration());
        res.setDescription(course.getDescription());

        courseRepo.save(res);
    }

    public void deleteById(Integer id) {
        courseRepo.deleteById(id);
    }
}
