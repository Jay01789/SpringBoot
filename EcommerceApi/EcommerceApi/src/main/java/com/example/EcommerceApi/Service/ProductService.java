package com.example.EcommerceApi.Service;

import com.example.EcommerceApi.Model.Product;
import com.example.EcommerceApi.Repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private IProductRepo productRepo;

    public void saveProduct(Product product) {
        productRepo.save(product);
    }

    public List<Product> getAll() {
        return productRepo.findAll();
    }


    public void delete(Integer pid) {
        productRepo.deleteById(pid);
    }
}
