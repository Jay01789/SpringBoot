package com.example.EcommerceApi.Service;

import com.example.EcommerceApi.Model.Address;
import com.example.EcommerceApi.Model.Order;
import com.example.EcommerceApi.Model.Product;
import com.example.EcommerceApi.Model.Users;
import com.example.EcommerceApi.Repo.IAddressRepo;
import com.example.EcommerceApi.Repo.IOrderRepo;
import com.example.EcommerceApi.Repo.IProductRepo;
import com.example.EcommerceApi.Repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class OrderService {

    @Autowired
   private IOrderRepo orderRepo;

    @Autowired
    private IUserRepo userRepo;

    @Autowired
    private IProductRepo productRepo;

    @Autowired
    private IAddressRepo addressRepo;

    public void placeOrder(Order order) {

        Integer userid = order.getOrderusers().getUser_id();
        Users users =userRepo.findById(userid).get();

//        Integer addressid = users.getUserAddress().getAddress_id();
//        Address address = addressRepo.findById(addressid).get();

        Integer addressid = order.getOrderaddress().getAddress_id();
        Address address = addressRepo.findById(addressid).get();

        Integer productid = order.getOrderproduct().getProduct_id();
        Product product = productRepo.findById(productid).get();

        order.setOrderusers(users);
        order.setOrderaddress(address);
        order.setOrderproduct(product);
        orderRepo.save(order);

        }

    public Optional<Order> getByid(Integer oId) {
        return orderRepo.findById(oId);
    }
}
