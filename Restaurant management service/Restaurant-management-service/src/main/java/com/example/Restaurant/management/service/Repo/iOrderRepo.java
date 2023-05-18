package com.example.Restaurant.management.service.Repo;

import com.example.Restaurant.management.service.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iOrderRepo  extends JpaRepository<Orders ,Integer> {
}
