package com.example.EmployeeAddress.Repo;

import com.example.EmployeeAddress.Model.Address;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Long> {

    @Modifying
    @Query(value = "update Address set city=:newcity where address_id=:empid",nativeQuery = true)
    void updateCity(String newcity, Long empid);
}
