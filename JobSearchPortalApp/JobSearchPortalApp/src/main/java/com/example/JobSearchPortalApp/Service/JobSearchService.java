package com.example.JobSearchPortalApp.Service;

import com.example.JobSearchPortalApp.Model.JobSearch;
import com.example.JobSearchPortalApp.Repo.IJobSearchRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobSearchService {
    @Autowired
    IJobSearchRepo repo ;
    public void add(Iterable<JobSearch> jobs) {
        repo.saveAll(jobs);
    }

    public List<JobSearch> getall() {
        return (List<JobSearch>) repo.findAll();
    }

    public Optional<JobSearch> getById(Integer jobid) {
        return repo.findById(jobid);
    }

    @Transactional
    public void updateLocation(String location,Integer jobid) {
        repo.updateLocation(jobid, location);
    }

    public Iterable<JobSearch> findCustom(double salary, String location) {
        return repo.findCustom(salary,location);
    }

    public void delete(Integer jobId) {
        repo.deleteById(jobId);
    }

    public Iterable<JobSearch> findByTitle(String title) {
       return repo.findByTitle(title);
    }
}
