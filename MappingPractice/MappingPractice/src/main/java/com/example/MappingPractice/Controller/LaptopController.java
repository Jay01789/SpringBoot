package com.example.MappingPractice.Controller;

import com.example.MappingPractice.Model.Laptop;
import com.example.MappingPractice.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/laptop")
public class LaptopController {

    @Autowired
    LaptopService laptopService;
    @PostMapping(value = "/save")
    public void save(@RequestBody Laptop laptop){
        laptopService.save(laptop);
    }

    @PutMapping(value = "/update/{id}")
    public void update(@PathVariable Integer id,@RequestBody Laptop laptop){
        laptopService.update(id,laptop);

    }

    @DeleteMapping(value = "delete/{id}")
    public void delete(@PathVariable Integer id){
        laptopService.delete(id);
    }
}
