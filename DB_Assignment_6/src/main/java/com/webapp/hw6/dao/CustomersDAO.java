package com.webapp.hw6.dao;

import com.webapp.hw6.model.Customers;
import com.webapp.hw6.repositories.CustomersRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class CustomersDAO implements DAO<Customers> {
    private final CustomersRepository customersRepository;

    @Override
    public Optional<Customers> get(Integer id) {
        return customersRepository.findById(id);
    }

    @Override
    public void create(Customers customers) {
        customersRepository.save(customers);
    }

    @Override
    public void delete(Customers customers) {
        customersRepository.delete(customers);
    }

    @Override
    public void update(Customers customers) {
        customersRepository.save(customers);
    }
}
