package com.example.EcommerceApi.Controller;

import com.example.EcommerceApi.Model.Product;
import com.example.EcommerceApi.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/saveProduct")
    public  void saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
    }

    @GetMapping(value = "/getAll")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @DeleteMapping(value = "/delete/{id}")
    public  void deleteById(@PathVariable String id){
        Integer Pid = Integer.parseInt(id);
        productService.delete(Pid);
    }
}
