package com.webapp.hw6.services;

import com.webapp.hw6.model.Customers;
import com.webapp.hw6.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersService {
    @Autowired
    CustomersRepository customersRepository;

    public Iterable<Customers> getAllCustomers() {
        return customersRepository.findAll();
    }

    public Customers getCustomerById(Integer id) {
        return customersRepository.findById(id).get();
    }

    public void deleteCustomerById(Integer id) {
        customersRepository.deleteById(id);
    }

    public Customers saveCustomer (Customers customers) {
        return customersRepository.save(customers);
    }
}
