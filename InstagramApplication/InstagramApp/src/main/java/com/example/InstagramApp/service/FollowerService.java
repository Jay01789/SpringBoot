package com.example.InstagramApp.service;


import com.example.InstagramApp.model.InstagramFollower;
import com.example.InstagramApp.model.User;
import com.example.InstagramApp.repo.IFollowerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowerService {

    @Autowired
    IFollowerRepo followerRepo;

    public void saveFollower(User myUser, User otherUser) {


        InstagramFollower follower = new InstagramFollower(null,myUser,otherUser);

        followerRepo.save(follower);
    }
}
