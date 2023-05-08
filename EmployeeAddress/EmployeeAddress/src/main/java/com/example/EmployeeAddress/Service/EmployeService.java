package com.example.EmployeeAddress.Service;

import com.example.EmployeeAddress.Model.Employee;
import com.example.EmployeeAddress.Repo.IEmployeRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeService {

    @Autowired
    private IEmployeRepo iEmployeRepo;

    public void saveEmp(Employee employee) {
        iEmployeRepo.save(employee);
    }


    public Iterable<Employee> getall() {
        return  iEmployeRepo.findAll();
    }

    public Optional<Employee> getByid(Integer empId) {
        return iEmployeRepo.findById(Long.valueOf(empId));
    }

    @Transactional
    public void updateName(String  lname, Long empid) {
        iEmployeRepo.updatelname(lname,empid);
    }

    public void delete(Long empid) {
        iEmployeRepo.deleteById(empid);
    }
}
