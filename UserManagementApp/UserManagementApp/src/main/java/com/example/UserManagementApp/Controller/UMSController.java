package com.example.UserManagementApp.Controller;

import com.example.UserManagementApp.Model.UMS;
import com.example.UserManagementApp.Service.UMSService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
