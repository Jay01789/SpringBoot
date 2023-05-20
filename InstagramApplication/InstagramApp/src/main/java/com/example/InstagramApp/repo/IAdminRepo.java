package com.example.InstagramApp.repo;

import com.example.InstagramApp.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin, Long> {
}
