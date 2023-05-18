package com.example.Restaurant.management.service.Repo;

import com.example.Restaurant.management.service.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iFoodRepo  extends JpaRepository<Food,Integer> {
}
