package com.example.UserManagementApp.Repo;

import com.example.UserManagementApp.Model.UMS;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UMSDao {

    List<UMS> userList = new ArrayList<>();


    public String add(UMS ums) {
        userList.add(ums);
        return "added sucessfully";
    }

    public Iterable<UMS> fetchUser() {
        return userList;
    }

    public void update(Integer userId, UMS ums) {
        for(UMS ans : userList){
            if(ans.getUserId().equals(userId)){
                        ans.setDate(ums.getDate());
                        ans.setDob(ums.getDob());
                        ans.setEmail(ums.getEmail());
                        ans.setTime(ums.getTime());
                        ans.setDate(ums.getDate());
            }
        }

    }
}
