package com.example.Spring_HW04_02.services;

import org.springframework.stereotype.Service;
import com.example.Spring_HW04_02.models.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public List<Product> getAllProducts(){
        return products;
    }
}