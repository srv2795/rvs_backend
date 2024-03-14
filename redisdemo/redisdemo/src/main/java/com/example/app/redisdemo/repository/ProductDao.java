package com.example.app.redisdemo.repository;

import com.example.app.redisdemo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDao {



    private static final String PRODUCT_HASH_KEY = "Product";

    @Autowired
    private RedisTemplate template;

    public Product save(Product product) {
        template.opsForHash().put(PRODUCT_HASH_KEY, product.getId(), product);
        return product;
    }

    public List<Product> getAllProducts() {
        return template.opsForHash().values(PRODUCT_HASH_KEY);
    }

    public Product findProductById(String id) {
        System.out.println("called findProductById().");
        return (Product) template.opsForHash().get(PRODUCT_HASH_KEY, id);
    }

    public String deleteProduct(String id) {
        System.out.println("delete performed.");
        template.opsForHash().delete(PRODUCT_HASH_KEY, id);
        return "Product removed !!!";
    }
}
