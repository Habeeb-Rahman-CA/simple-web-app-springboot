package com.habeeb.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.habeeb.simpleWebApp.model.Product;

@Service
public class ProductService {

    // Dummy data
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "MacBook Air", 50000),
            new Product(2, "IPhone 16e", 59999),
            new Product(3, "AirPod 2nd Gen", 19999)));

    // Get all product
    public List<Product> getProducts() {
        return products;
    }

    // Get product based on Product Id
    public Product getProductById(int prodId) {
        return products.stream().filter(p -> p.getProdId() == prodId).findFirst().get();
    }

    // Adding new product to the Product list
    public void addProduct(Product prod) {
        products.add(prod);
    }

    // Updating a product based on Index
    public void updateProduct(Product prod) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId()) {
                index = i;
            }
        }
        products.set(index, prod);
    }

    // Delete a product based on Product Id
    public void deleteProduct(@PathVariable int prodId) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                index = i;
            }
        }
        products.remove(index);
    }

}
