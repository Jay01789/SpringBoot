package com.example.Restaurant.management.service.Service;

import com.example.Restaurant.management.service.Model.AuthenticationToken;
import com.example.Restaurant.management.service.Model.User;
import com.example.Restaurant.management.service.Repo.iAuthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private iAuthRepo authRepo ;


    public AuthenticationToken getToken(User user) {

        return authRepo.findByUser(user);

    }
}
