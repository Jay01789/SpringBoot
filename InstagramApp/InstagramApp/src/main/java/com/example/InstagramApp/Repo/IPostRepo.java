package com.example.InstagramApp.Repo;

import com.example.InstagramApp.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Integer> {
}
