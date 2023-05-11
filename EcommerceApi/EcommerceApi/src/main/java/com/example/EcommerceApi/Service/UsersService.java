package com.example.EcommerceApi.Service;

import com.example.EcommerceApi.Model.Address;
import com.example.EcommerceApi.Model.Users;
import com.example.EcommerceApi.Repo.IAddressRepo;
import com.example.EcommerceApi.Repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersService {
    @Autowired
   private IUserRepo userRepo ;

    @Autowired
    private IAddressRepo addressRepo;



    public void addUser(Users users) {

        Integer addressid = users.getUserAddress().getAddress_id();
        Address address = addressRepo.findById(addressid).get();
        users.setUserAddress(address);
      userRepo.save(users);
    }

    public Optional<Users> findByid(Integer O_Id) {
        return userRepo.findById(O_Id);
    }
}
