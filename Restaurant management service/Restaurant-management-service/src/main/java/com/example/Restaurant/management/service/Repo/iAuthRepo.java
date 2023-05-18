package com.example.Restaurant.management.service.Repo;

import com.example.Restaurant.management.service.Model.AuthenticationToken;
import com.example.Restaurant.management.service.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iAuthRepo extends JpaRepository<AuthenticationToken ,Integer> {
    AuthenticationToken findByUser(User user);


}
