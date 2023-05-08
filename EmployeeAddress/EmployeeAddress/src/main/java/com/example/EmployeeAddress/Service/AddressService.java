package com.example.EmployeeAddress.Service;

import com.example.EmployeeAddress.Model.Address;
import com.example.EmployeeAddress.Repo.IAddressRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private IAddressRepo iAddressRepo;

    public void saveAddress(Address address) {
        iAddressRepo.save(address);
    }

    public Iterable<Address> getAll() {
        return iAddressRepo.findAll();
    }

    public Optional<Address> getByid(Integer empId) {
        return iAddressRepo.findById(Long.valueOf(empId));
    }
    @Transactional
    public void updateCity(String city, Long empid) {
        iAddressRepo.updateCity(city,empid);
    }

    public void delete(Long empid) {
        iAddressRepo.deleteById(empid);
    }
}
