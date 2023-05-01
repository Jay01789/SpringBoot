package com.example.JobSearchPortalApp.Controller;

import com.example.JobSearchPortalApp.Model.JobSearch;
import com.example.JobSearchPortalApp.Service.JobSearchService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestParam(value = "/")
public class JobSearchController {
    @Autowired
    JobSearchService service ;

    @PostMapping( value = "/jobs")
    public void addJobs( @Valid @RequestBody Iterable<JobSearch> jobs){
        service.add(jobs);
    }

    @GetMapping(value = "/getall")
    public List<JobSearch> getAll(){
        return service.getall();
    }

    @GetMapping(value = "/getById/{id}")
    public Optional<JobSearch> getById(@PathVariable String id){
        Integer jobid = Integer.parseInt(id);
       return service.getById(jobid);
    }


    //Custom Queries
    @PutMapping(value ="/id/{id}/location/{location}")
    public void updateLocation(@PathVariable String id ,@PathVariable String location){
        Integer jobid = Integer.parseInt(id);
        service.updateLocation(location,jobid);

    }

    //Custom Queries
    @GetMapping(value = "/salary/{salary}/location/{location}")
    public Iterable<JobSearch> findBySalaryAndLocation(@PathVariable String salary,@PathVariable String location){
        Double sal = (double) Integer.parseInt(salary);
        return service.findCustom(sal,location);
    }

    @GetMapping(value = "/title/{title}")
    public Iterable<JobSearch> findByTitle(@PathVariable String title){
        return service.findByTitle(title);
    }

    @DeleteMapping(value = "delete/{id}")
    public void deleteById(@PathVariable String id){
        Integer jobId =  Integer.parseInt(id);
        service.delete(jobId);

    }


}
