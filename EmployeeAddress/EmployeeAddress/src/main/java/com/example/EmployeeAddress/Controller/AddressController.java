package com.example.EmployeeAddress.Controller;

import com.example.EmployeeAddress.Model.Address;
import com.example.EmployeeAddress.Model.Employee;
import com.example.EmployeeAddress.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping(value = "/save")
    public void saveAddress(@RequestBody Address address){
        addressService.saveAddress(address);
    }

    @GetMapping(value = "/getAll")
    public Iterable<Address> getAll(){
        return  addressService.getAll();
    }

    @GetMapping(value = "/getByid/{id}")
    public Optional<Address> getByid(@PathVariable String id){
        Integer empId = Integer.parseInt(id);
        return   addressService.getByid(empId);
    }

    @PutMapping(value = "/updateCity/{id}/city/{city}")
    public void updateName(@PathVariable String city ,  @PathVariable String id){
        Long empid = Long.parseLong(id);
        addressService.updateCity(city,empid);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteEmployee(@PathVariable String id){
        Long empid = Long.parseLong(id);
        addressService.delete(empid);
    }
}
