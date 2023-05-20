package com.example.InstagramApp.repo;


import com.example.InstagramApp.model.InstagramFollowing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFollowingRepo extends JpaRepository<InstagramFollowing, Long> {

    Long countByUser_userId(long userId);
}
