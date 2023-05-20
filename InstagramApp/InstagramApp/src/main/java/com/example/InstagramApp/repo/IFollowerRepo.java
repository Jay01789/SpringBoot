package com.example.InstagramApp.repo;

import com.example.InstagramApp.model.InstagramFollower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFollowerRepo extends JpaRepository<InstagramFollower, Long> {


}
