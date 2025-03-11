package com.habeeb.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.habeeb.simpleWebApp.model.Product;
import com.habeeb.simpleWebApp.repository.ProductRepository;

@Service
public class ProductService {

    // Injecting Repository
    @Autowired
    ProductRepository repository;

    // Dummy data
    // List<Product> products = new ArrayList<>(Arrays.asList(
    //         new Product(1, "MacBook Air", 50000),
    //         new Product(2, "IPhone 16e", 59999),
    //         new Product(3, "AirPod 2nd Gen", 19999)));

    // Get all product
    public List<Product> getProducts() {
        return repository.findAll();
    }

    // Get product based on Product Id
    public Product getProductById(int prodId) {
        return repository.findById(prodId).orElse(new Product());
    }

    // Adding new product to the Product list
    public void addProduct(Product prod) {
        repository.save(prod);
    }

    // Updating a product based on Index
    public void updateProduct(Product prod) {
        repository.save(prod);
    }

    // Delete a product based on Product Id
    public void deleteProduct(int prodId) {
        repository.deleteById(prodId);
    }

}
