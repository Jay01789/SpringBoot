package com.example.EcommerceApi.Controller;

import com.example.EcommerceApi.Model.Address;
import com.example.EcommerceApi.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping(value = "/address")
    public void saveAddress(@RequestBody Address address){
        addressService.saveAddress(address);
    }
}
