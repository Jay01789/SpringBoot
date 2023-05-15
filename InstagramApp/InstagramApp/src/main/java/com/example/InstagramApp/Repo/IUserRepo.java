package com.example.InstagramApp.Repo;

import com.example.InstagramApp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo  extends JpaRepository<User ,Integer> {

     User findFirstByUseremail(String userEmail);
}
