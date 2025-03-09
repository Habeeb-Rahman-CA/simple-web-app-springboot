package com.habeeb.simpleWebApp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.habeeb.simpleWebApp.model.Product;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(1, "MacBook Air", 50000),
            new Product(2, "IPhone 16e", 59999),
            new Product(2, "AirPod 2nd Gen", 19999));

    public List<Product> getProducts() {
        return products;
    }
}
