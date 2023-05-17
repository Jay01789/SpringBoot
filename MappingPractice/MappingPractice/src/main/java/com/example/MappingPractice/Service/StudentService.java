package com.example.MappingPractice.Service;

import com.example.MappingPractice.Model.Address;
import com.example.MappingPractice.Model.Student;
import com.example.MappingPractice.Repo.iAddressRepo;
import com.example.MappingPractice.Repo.iStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private iStudentRepo studentRepo;

    @Autowired
    private iAddressRepo  addressRepo;

    public void save(Student student) {
        Integer stuAddressid = student.getAddressId().getAddressId() ;

        Address Saddress = addressRepo.findById(stuAddressid).get();
        student.setAddressId(Saddress);

        studentRepo.save(student);
    }

    public List<Student> getAll() {
      return   studentRepo.findAll();
    }


    public void update(Integer id, Student student) {
        Student res = studentRepo.findById(id).get();
        res.setName(student.getName());
        res.setAge(student.getAge());
        res.setPhoneNumber(student.getPhoneNumber());
        res.setBranch(student.getBranch());
        res.setDepartment(student.getDepartment());
        studentRepo.save(res);

    }

    public void delete(Integer id) {
        studentRepo.deleteById(id);
    }
}
