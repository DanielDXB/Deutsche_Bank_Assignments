package com.webapp.hw6.dao;

import com.webapp.hw6.model.Products;
import com.webapp.hw6.repositories.ProductsRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class ProductsDAO implements DAO<Products>{
    private final ProductsRepository productsRepository;

    @Override
    public Optional<Products> get(Integer id) {
        return productsRepository.findById(id);
    }

    @Override
    public void create(Products products) {
        productsRepository.save(products);
    }

    @Override
    public void delete(Products products) {
        productsRepository.delete(products);
    }

    @Override
    public void update(Products products) {
        productsRepository.save(products);
    }
}
