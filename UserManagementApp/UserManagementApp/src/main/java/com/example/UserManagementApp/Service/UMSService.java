package com.example.UserManagementApp.Service;

import com.example.UserManagementApp.Model.UMS;
import com.example.UserManagementApp.Repo.UMSDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UMSService {
    @Autowired
    private UMSDao dao;

    public String add(UMS ums) {
        return dao.add(ums);
    }

    public Iterable<UMS> getAll() {
        return dao.fetchUser();
    }

    public Iterable<UMS> findBy(Integer userId) {
        Iterable<UMS> res = getAll();
        for (UMS ans : res) {
            if (ans.getUserId().equals(userId)) {
                return (Iterable<UMS>) ans;
            }
        }
        return null;
    }

    public void update(Integer userId, UMS ums) {
        dao.update(userId,ums);
    }

    public void delete(Integer userId) {
        dao.delete(userId);

    }
}
