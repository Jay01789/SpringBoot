package com.example.UserManagementSystem.Service;

import com.example.UserManagementSystem.Controller.Model.UMS;
import com.example.UserManagementSystem.Dao.UMSDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UMSService {
    @Autowired
    UMSDao umsDao ;

    public String save(UMS ums) {
        boolean status = umsDao.saveuser( ums);
        if(status){
            return "user saved successfully";
        }
        else{
            return "user not saved";
        }
    }

    public List<UMS> getall() {
        return umsDao.getall();
    }

    public UMS getbyid(String id) {
        List<UMS> res = umsDao.getall();
        for (UMS ans:res){
            if(ans.getUserid().equals(id)){
                return ans;
            }
        }
        return null ;
    }

    public String update(String id , UMS ums) {
        List<UMS> res = umsDao.getall();
        for (UMS ans:res){
            if(ans.getUserid().equals(id)){
                res.remove(ans);
                res.add(ums);
                return "updated successfully" ;
            }
        }
        return "ID Doesnt exist / Invalid ID" ;
    }

    public String delete(String id) {
        if(id != null){
            List<UMS> res = umsDao.getall();
            for(UMS ans:res){
                if(ans.getUserid().equals(id)){
                    res.remove(ans);
                    return "User deleted sucessfully";
                }
            }

        }else {
            return "Invalid ID";
        }
        return "ID not found";
    }
}
