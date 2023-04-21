package com.example.UserManagementSystem.Dao;

import com.example.UserManagementSystem.Controller.Model.UMS;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UMSDao {
    List<UMS> umsList ;
    public UMSDao(){
        umsList = new ArrayList<>();

    }

    public boolean saveuser(UMS ums) {
        umsList.add(ums);
        return true;
    }

    public List<UMS> getall() {
        return umsList ;
    }
}
