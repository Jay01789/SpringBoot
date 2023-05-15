package com.example.InstagramApp.Service;

import com.example.InstagramApp.Model.Post;
import com.example.InstagramApp.Repo.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    IPostRepo postRepo;

    @Autowired
    AuthService tokenService;


    public List<Post> findAll(String userEmail, String token) {
        List<Post> res = null ;
        if(tokenService.authticate(userEmail,token)){
          res =  postRepo.findAll();
        }
    return res;
    }
}
