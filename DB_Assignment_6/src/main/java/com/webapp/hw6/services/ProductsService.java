package com.webapp.hw6.services;

import com.webapp.hw6.model.Products;
import com.webapp.hw6.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductsService {
    @Autowired
    ProductsRepository productsRepository;

    public Products saveProduct(Products products) {
        return productsRepository.save(products);
    }

    public Iterable<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    public void deleteProductFromOrder(Integer id) {
        productsRepository.deleteById(id);
    }
}
