package com.example.InstagramApp.Controller;

import com.example.InstagramApp.Model.Post;
import com.example.InstagramApp.Repo.IPostRepo;
import com.example.InstagramApp.Service.PostService;
import com.example.InstagramApp.Service.UserService;
import com.example.InstagramApp.dto.SIgnInInput;
import com.example.InstagramApp.dto.SignInOutput;
import com.example.InstagramApp.dto.SignUpInput;
import com.example.InstagramApp.dto.SignUpOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    @PostMapping("/signup")
    public SignUpOutput signup(@RequestBody SignUpInput signUpDto) throws NoSuchAlgorithmException {
        return userService.signup(signUpDto);
    }

    @PostMapping("signin")
    public SignInOutput signin(@RequestBody SIgnInInput signInDto) throws NoSuchAlgorithmException {
        return userService.SignIn(signInDto);
    }

    @PostMapping("/post")
    public void postAPic(@RequestBody Post post , @RequestParam String userEmail,@RequestParam String token){
        userService.post(post,userEmail,token);
    }

    @GetMapping("/getPost/")
    public List<Post> getPost(@RequestParam String userEmail,String Token){
        return postService.findAll(userEmail,Token);
    }
}
