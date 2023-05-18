package com.example.Restaurant.management.service.Service;

import com.example.Restaurant.management.service.Model.Food;
import com.example.Restaurant.management.service.Model.Orders;
import com.example.Restaurant.management.service.Model.User;
import com.example.Restaurant.management.service.Repo.iFoodRepo;
import com.example.Restaurant.management.service.Repo.iOrderRepo;
import com.example.Restaurant.management.service.Repo.iUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private iOrderRepo orderRepo;

    @Autowired
    private iUserRepo userRepo;

    @Autowired
    private iFoodRepo foodRepo;

    public void orderFood(Orders orders) {

        Integer orderuserid = orders.getOrder_user().getUserId();
        User user = userRepo.findById(orderuserid).get();

        orders.setOrder_user(user);
        orderRepo.save(orders);


    }

    public List<Food> getall() {

       return  foodRepo.findAll();
    }


    public void update(Integer id, Orders orders) {
        Orders orders1 = orderRepo.findById(id).get();
        orders1.setStatus(orders.getStatus());
        orderRepo.save(orders1);
    }
}
