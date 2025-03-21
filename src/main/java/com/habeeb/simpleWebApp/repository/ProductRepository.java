package com.habeeb.simpleWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.habeeb.simpleWebApp.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
