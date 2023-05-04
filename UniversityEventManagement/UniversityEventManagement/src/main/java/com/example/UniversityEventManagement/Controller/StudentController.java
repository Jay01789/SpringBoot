package com.example.UniversityEventManagement.Controller;

import com.example.UniversityEventManagement.Model.DepartmentType;
import com.example.UniversityEventManagement.Model.Student;
import com.example.UniversityEventManagement.Service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/add-Students")
    public void add(@Valid @RequestBody Student student){
        studentService.add(student);
    }

    @PutMapping(value = "/dept/{dep}/id/{id}")
    void update(@PathVariable DepartmentType dep, @PathVariable String id){
        Integer studentId = Integer.parseInt(id);
//        String value = DepartmentType.name();
        studentService.update(dep,studentId);
    }

    @DeleteMapping(value="/delete/{id}")
    void deleteById(@PathVariable String id ){
        Integer studentId = Integer.parseInt(id);
        studentService.delete(studentId);
    }

    @GetMapping(value = "/getAll")
    Iterable<Student> getAllStudents( ){
        return studentService.getall();
    }

    @GetMapping(value = "/getById/{id}")
    Optional<Student> get(@PathVariable String id){
        Integer studentId = Integer.parseInt(id);
        return studentService.getById(studentId);
    }
}
