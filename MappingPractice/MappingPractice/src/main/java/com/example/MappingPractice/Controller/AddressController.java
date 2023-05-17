package com.example.MappingPractice.Controller;

import com.example.MappingPractice.Model.Address;
import com.example.MappingPractice.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping(value = "/save")
    public void save(@RequestBody Address address){
        addressService.save(address);
    }

    @GetMapping(value = "/getall")
    public List<Address> getAll(){
        return addressService.getAll();
    }

    @PutMapping(value = "/update/{id}")
    public void updateLandmark(@PathVariable Integer id , @RequestBody Address address){
        addressService.update(id,address);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteById(@PathVariable Integer id){
        addressService.delete(id);
    }

}
