package com.example.UniversityEventManagement.Repo;

import com.example.UniversityEventManagement.Model.DepartmentType;
import com.example.UniversityEventManagement.Model.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<Student,Integer> {

    @Modifying
    @Query(value = "update student set department= :dep where student_id= :id" , nativeQuery = true)
    public void update(String dep, Integer id);


}
