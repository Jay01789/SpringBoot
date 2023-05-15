package com.example.InstagramApp.Service;

import com.example.InstagramApp.Model.AuthenticationToken;
import com.example.InstagramApp.Model.User;
import com.example.InstagramApp.Repo.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    ITokenRepo tokenRepo;


    public void saveToken(AuthenticationToken token)
    {
        tokenRepo.save(token);
    }

    public AuthenticationToken getToken(User user) {
      return   tokenRepo.findByUser(user);
    }

    public boolean authticate(String userEmail, String token) {

        AuthenticationToken authenticationToken = tokenRepo.findFirstByToken(token);
        String expectedEmail = authenticationToken.getUser().getUseremail();
        return expectedEmail.equals(userEmail);
    }
}
