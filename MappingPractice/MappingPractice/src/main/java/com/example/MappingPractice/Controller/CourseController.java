package com.example.MappingPractice.Controller;

import com.example.MappingPractice.Model.Course;
import com.example.MappingPractice.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping(value = "/save")
    public void save(@RequestBody Course course){
        courseService.save(course);
    }

    @GetMapping("/getall")
    public List<Course> getAll(){
        return courseService.getAll();
    }

    @PutMapping("update/{id}")
    public void update(@PathVariable Integer id,@RequestBody Course course){
        courseService.update(id,course);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        courseService.deleteById(id);
    }
}
