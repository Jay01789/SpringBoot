package com.example.Restaurant.management.service.Controller;

import com.example.Restaurant.management.service.Model.Admin;
import com.example.Restaurant.management.service.Service.AdminService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping(value = "/save")
    public void saveAdmin(@Valid @RequestBody Admin admin){
        adminService.save(admin);


    }
}
