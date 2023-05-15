package com.example.InstagramApp.Repo;

import com.example.InstagramApp.Model.AuthenticationToken;
import com.example.InstagramApp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthenticationToken ,Integer> {

    AuthenticationToken findByUser(User user);

    AuthenticationToken findFirstByToken(String token);
}
