package com.habeeb.simpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int prodId;
    private String prodName;
    private int prodPrice;

    
}
