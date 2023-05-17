package com.example.MappingPractice.Controller;

import com.example.MappingPractice.Model.Student;
import com.example.MappingPractice.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(name = "/save")
    public void save(@RequestBody Student student){
        studentService.save(student);
    }

    @GetMapping(name = "/getall")
    public List<Student> getAll(){
        return studentService.getAll();
    }


    @PutMapping(value = "/update/id/{id}")
    public void updateById(@PathVariable Integer id , @RequestBody Student student){
        studentService.update(id,student);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteById(@PathVariable Integer id){
        studentService.delete(id);
    }
}
