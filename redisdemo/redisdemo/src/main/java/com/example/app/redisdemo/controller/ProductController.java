package com.example.app.redisdemo.controller;

import com.example.app.redisdemo.entity.Product;
import com.example.app.redisdemo.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/v1/api/product")
@RequestMapping("/v1/api/product")
public class ProductController {

    @Autowired
    private ProductDao dao;

    @GetMapping("/check")
    public String checkHealth() {
        return "i am running fine...!";
    }

    @PostMapping("/add")
    public Product saveProduct(@RequestBody Product product) {
        return dao.save(product);
    }

    @GetMapping("/")
    public List<Product> getAllProduct() {
        return dao.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById (@PathVariable("id") int id) {
        return dao.findProductById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable("id") int id) {
        return dao.deleteProduct(id);
    }
}
