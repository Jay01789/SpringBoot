package com.example.UserManagementApp.Controller;

import com.example.UserManagementApp.Model.UMS;
import com.example.UserManagementApp.Service.UMSService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UMSController {
    @Autowired
    private UMSService service;

    @PostMapping( value = "/add")
    public String addUser(@Valid @RequestBody UMS ums){
        return service.add(ums);
    }

    @GetMapping(value = "/all")
    public Iterable<UMS> getAll(){
        return service.getAll();
    }

    @GetMapping(value = "/getByid/{id}")
    public Iterable<UMS> getById(@PathVariable String id){
        Integer userId = Integer.parseInt(id);
        return service.findBy(userId);
    }

    @PutMapping(value = "/update/id/{id}")
    public void update(@PathVariable String id , @RequestBody UMS ums){
        Integer userId = Integer.parseInt(id);
        service.update(userId,ums);

    }
}
