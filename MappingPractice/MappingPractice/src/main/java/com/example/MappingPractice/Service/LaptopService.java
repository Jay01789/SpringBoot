package com.example.MappingPractice.Service;

import com.example.MappingPractice.Model.Laptop;
import com.example.MappingPractice.Model.Student;
import com.example.MappingPractice.Repo.iLaptopRepo;
import com.example.MappingPractice.Repo.iStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    iLaptopRepo laptopRepo;

    @Autowired
    iStudentRepo studentRepo;

    public void save(Laptop laptop) {
        Integer Lstudentid = laptop.getStudentId().getStudentId();
        Student Lstudent = studentRepo.findById(Lstudentid).get();
        laptop.setStudentId(Lstudent);
        laptopRepo.save(laptop);
    }

    public void update(Integer id, Laptop laptop) {
        Laptop res = laptopRepo.findById(id).get();
        res.setBrand(laptop.getBrand());
        res.setName(laptop.getName());
        res.setPrice(laptop.getPrice());

        laptopRepo.save(res);
    }

    public void delete(Integer id){
        laptopRepo.deleteById(id);
    }
}
