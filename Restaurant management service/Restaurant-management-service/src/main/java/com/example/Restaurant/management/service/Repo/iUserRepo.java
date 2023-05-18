package com.example.Restaurant.management.service.Repo;

import com.example.Restaurant.management.service.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iUserRepo extends JpaRepository<User,Integer> {
    User findFirstByEmail(String userEmail);

    User findByEmail(String userEmail);
}
