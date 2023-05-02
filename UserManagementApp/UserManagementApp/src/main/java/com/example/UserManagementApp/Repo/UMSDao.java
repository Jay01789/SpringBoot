package com.example.UserManagementApp.Repo;

import com.example.UserManagementApp.Model.UMS;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UMSDao {

    List<UMS> userList =  new ArrayList<>();



    public String add(UMS ums){
        userList.add(ums);
        return "added sucessfully";
    }

    public Iterable<UMS> fetchUser() {
        return userList;
    }
}
