package com.example.MappingPractice.Repo;

import com.example.MappingPractice.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iAddressRepo extends JpaRepository<Address ,Integer> {


}
