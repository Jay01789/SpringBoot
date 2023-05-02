package com.example.UserManagementApp.Service;

import com.example.UserManagementApp.Model.UMS;
import com.example.UserManagementApp.Repo.UMSDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
