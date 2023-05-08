package com.example.EmployeeAddress.Repo;

import com.example.EmployeeAddress.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeRepo extends CrudRepository<Employee ,Long> {
    @Modifying
    @Query(value = "update Employee set last_name=:lname where employee_id=:empid",nativeQuery = true)
    void updatelname(String lname,Long empid);

}
