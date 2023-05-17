package com.example.MappingPractice.Service;

import com.example.MappingPractice.Model.Address;
import com.example.MappingPractice.Repo.iAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private iAddressRepo addressRepo;
    public void save(Address address) {
        addressRepo.save(address);
    }

    public List<Address> getAll() {
        return addressRepo.findAll();
    }

    public void update(Integer id, Address address) {
        Optional<Address> res = addressRepo.findById(id);
        Address ans =  res.get();
        ans.setDistrict(address.getDistrict());
        ans.setState(address.getState());
        ans.setZipcode(address.getZipcode());
        ans.setCountry(address.getCountry());
        ans.setLandmark(address.getLandmark());


        addressRepo.save(ans);
    }

    public void delete(Integer id) {

        addressRepo.deleteById(id);
    }
}
