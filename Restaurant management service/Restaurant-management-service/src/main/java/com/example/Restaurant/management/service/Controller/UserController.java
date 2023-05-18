package com.example.Restaurant.management.service.Controller;

import com.example.Restaurant.management.service.Service.UserService;
import com.example.Restaurant.management.service.dto.SignInInput;
import com.example.Restaurant.management.service.dto.SignInOutput;
import com.example.Restaurant.management.service.dto.SignUpInput;
import com.example.Restaurant.management.service.dto.SignUpOutput;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public SignUpOutput signup( @Valid @RequestBody SignUpInput signUpInput)
    {
        return userService.signup(signUpInput);
    }

    @PostMapping("/signIn")
    public SignInOutput signin(@RequestBody SignInInput signInInput)
    {
        return userService.signin(signInInput);
    }
}
