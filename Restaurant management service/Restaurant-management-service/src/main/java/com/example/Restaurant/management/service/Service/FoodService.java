package com.example.Restaurant.management.service.Service;

import com.example.Restaurant.management.service.Model.Admin;
import com.example.Restaurant.management.service.Model.Food;
import com.example.Restaurant.management.service.Repo.iAdminRepo;
import com.example.Restaurant.management.service.Repo.iFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    @Autowired
    private iFoodRepo foodRepo;

    @Autowired
    private iAdminRepo adminRepo ;

    public void save(Food food) {
        foodRepo.save(food);
    }
}
