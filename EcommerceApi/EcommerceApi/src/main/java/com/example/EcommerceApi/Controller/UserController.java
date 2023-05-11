package com.example.EcommerceApi.Controller;

import com.example.EcommerceApi.Model.Users;
import com.example.EcommerceApi.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UsersService usersService;

    @PostMapping(value = "/addUser")
    public void addUser(@RequestBody Users users){
        usersService.addUser(users);
    }

    @GetMapping(value = "/{id}")
    public Optional<Users> getByid(@PathVariable String id){
        Integer O_id = Integer.parseInt( id);
        return usersService.findByid(O_id);
    }

}
