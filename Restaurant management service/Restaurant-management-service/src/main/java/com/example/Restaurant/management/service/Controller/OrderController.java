package com.example.Restaurant.management.service.Controller;

import com.example.Restaurant.management.service.Model.Food;
import com.example.Restaurant.management.service.Model.Orders;
import com.example.Restaurant.management.service.Service.OrderService;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService ;

    @PostMapping("/order")
    public void order(@RequestBody Orders orders){
        orderService.orderFood(orders);
    }

     @GetMapping("/foodAvailable")
    public List<Food> getAll(){
        return orderService.getall();
     }

     @PutMapping("/update/id/{id}")
    public void update(Integer id , @RequestBody Orders orders)
     {
         orderService.update( id ,orders);
     }

}
