package com.habeeb.simpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.habeeb.simpleWebApp.model.Product;
import com.habeeb.simpleWebApp.service.ProductService;

@RestController
public class ProductController {

    // Injecting the service
    @Autowired
    ProductService service;

    // Get all product
    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    // Get product based on Product Id
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

    // Adding new product to the Product list
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
    }

    // Updating a product based on Product Id
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod) {
        service.updateProduct(prod);
    }

    // Delete a product based on Product Id
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
        service.deleteProduct(prodId);
    }

}
