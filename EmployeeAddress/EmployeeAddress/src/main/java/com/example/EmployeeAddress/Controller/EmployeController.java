package com.example.EmployeeAddress.Controller;

import com.example.EmployeeAddress.Model.Employee;
import com.example.EmployeeAddress.Service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/employee")
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    @PostMapping(value = "/save")
    public void saveEmp(@RequestBody Employee employee){
        employeService.saveEmp(employee);
    }

    @GetMapping(value = "/employees")
    public Iterable<Employee> getall(){
      return   employeService.getall();
    }

    @GetMapping(value = "/getByid/{id}")
    public Optional<Employee> getByid(@PathVariable String id){
        Integer empId = Integer.parseInt(id);
       return   employeService.getByid(empId);
    }

    @PutMapping(value = "/updateLastName/{id}/lname/{lname}")
    public void updateName(@PathVariable String lname ,  @PathVariable String id){
        Long empid = Long.parseLong(id);
        employeService.updateName(lname,empid);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteEmployee(@PathVariable String id){
        Long empid = Long.parseLong(id);
        employeService.delete(empid);
    }

}
