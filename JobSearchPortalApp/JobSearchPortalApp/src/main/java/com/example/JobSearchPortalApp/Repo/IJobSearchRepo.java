package com.example.JobSearchPortalApp.Repo;

import com.example.JobSearchPortalApp.Model.JobSearch;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJobSearchRepo extends CrudRepository<JobSearch,Integer> {

    @Modifying
    @Query(value = "update   JOB_SEARCH set location = :newLocation where job_Id = :jobid" , nativeQuery = true)
    void updateLocation(Integer jobid, String newLocation);

    @Query(value = "select * from JOB_SEARCH where salary > :jobsalary and location = :joblocation",nativeQuery = true)
    Iterable<JobSearch> findCustom(double jobsalary , String joblocation);

    @Query(value = "select * from JOB_SEARCH where title = :jobTitle",nativeQuery = true)
    Iterable<JobSearch> findByTitle(String jobTitle);



}
