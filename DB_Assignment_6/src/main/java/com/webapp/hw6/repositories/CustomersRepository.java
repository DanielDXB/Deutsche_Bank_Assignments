package com.webapp.hw6.repositories;

import com.webapp.hw6.model.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends CrudRepository<Customers, Integer> {
    Iterable<Customers> getAllByUsername(String username);
    Iterable<Customers> getAllByCity(String city);
    Iterable<Customers> getAllByCountry(String country);
}
