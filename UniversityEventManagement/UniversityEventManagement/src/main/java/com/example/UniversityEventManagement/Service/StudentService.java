package com.example.UniversityEventManagement.Service;

import com.example.UniversityEventManagement.Model.DepartmentType;
import com.example.UniversityEventManagement.Model.Student;
import com.example.UniversityEventManagement.Repo.IStudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo iStudentRepo;
    public void add(Student student) {
        iStudentRepo.save(student);
    }

    @Transactional
    public void update(DepartmentType dep, Integer id) {
        String value = dep.name();
        iStudentRepo.update(value,id);
    }

    public void delete(Integer studentId) {
        iStudentRepo.deleteById(studentId);
    }

    public List<Student> getall() {
       return (List<Student>) iStudentRepo.findAll();
    }

    public Optional<Student> getById(Integer id) {
        return iStudentRepo.findById(id);
    }
}
