package com.example.InstagramApp.repo;

import com.example.InstagramApp.model.Post;
import com.example.InstagramApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostRepo extends JpaRepository<Post, Integer> {
    List<Post> findByUser(User user);

}
