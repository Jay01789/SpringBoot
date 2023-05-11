package com.example.EcommerceApi.Controller;

import com.example.EcommerceApi.Model.Order;
import com.example.EcommerceApi.Model.Users;
import com.example.EcommerceApi.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping
    public void placeOrder(@RequestBody Order myorder){
        orderService.placeOrder(myorder);
    }

    @GetMapping(value = "/{id}")
    public Optional<Order> getOrderById(@PathVariable String id){
        Integer O_Id = Integer.parseInt(id);
        return orderService.getByid(O_Id);
    }
}
