package com.example.InstagramApp.service;

import com.example.InstagramApp.model.InstagramFollowing;
import com.example.InstagramApp.model.User;
import com.example.InstagramApp.repo.IFollowingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowingService {

    @Autowired
    IFollowingRepo followingRepo ;

    public void saveFollowing(User myUser, User otherUser) {
        InstagramFollowing followingRecord = new InstagramFollowing(null,myUser,otherUser);
        followingRepo.save(followingRecord);
    }
}
