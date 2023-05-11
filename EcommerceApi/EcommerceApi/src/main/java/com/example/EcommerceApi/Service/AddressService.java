package com.example.EcommerceApi.Service;

import com.example.EcommerceApi.Model.Address;
import com.example.EcommerceApi.Repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private IAddressRepo addressRepo;

    public void saveAddress(Address address) {
        addressRepo.save(address);
    }
}
