package com.example.app.redisdemo;

import com.example.app.redisdemo.entity.Product;
import com.example.app.redisdemo.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/v1/api/product")
public class RedisDemoApplication {

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
	public Product getProductById (@PathVariable("id") String id) {
		return dao.findProductById(id);
	}

	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable("id") String id) {
		return dao.deleteProduct(id);
	}

	public static void main(String[] args) {
		SpringApplication.run(RedisDemoApplication.class, args);
	}

}
