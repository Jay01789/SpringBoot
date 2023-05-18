package com.example.Restaurant.management.service.Controller;

import com.example.Restaurant.management.service.Model.Food;
import com.example.Restaurant.management.service.Service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @PostMapping("/add")
    public void addFood( @RequestBody Food food){
        foodService.save(food);
    }
}
