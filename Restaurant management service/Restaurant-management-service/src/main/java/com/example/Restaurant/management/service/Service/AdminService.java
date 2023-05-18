package com.example.Restaurant.management.service.Service;

import com.example.Restaurant.management.service.Model.Admin;
import com.example.Restaurant.management.service.Repo.iAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private iAdminRepo adminRepo;

    public void save(Admin admin) {
        adminRepo.save(admin);
    }
}
