package com.example.MappingPractice.Repo;

import com.example.MappingPractice.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iLaptopRepo extends JpaRepository<Laptop ,Integer> {

}
