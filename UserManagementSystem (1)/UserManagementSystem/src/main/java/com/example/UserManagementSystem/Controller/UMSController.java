package com.example.UserManagementSystem.Controller;

import com.example.UserManagementSystem.Controller.Model.UMS;
import com.example.UserManagementSystem.Service.UMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UMSController {
    @Autowired
    UMSService umsService;

    @PostMapping(value = "/save")
    public String save(@RequestBody UMS ums){
       return umsService.save(ums);
    }
    @GetMapping(value = "/alluser")
    public List<UMS> getall(){
        return umsService.getall();
    }

    @GetMapping(value = "/userbyid/{id}")
    public UMS getbyid(@PathVariable String id){
        return umsService.getbyid(id);
    }

    @PutMapping(value = "/update/{id}")
    public String update(@PathVariable String id ,@RequestBody UMS ums){
        return umsService.update(id,ums);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String delete(@PathVariable String id){
        return umsService.delete(id);
    }


}
