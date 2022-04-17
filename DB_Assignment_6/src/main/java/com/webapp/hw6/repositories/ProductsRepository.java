package com.webapp.hw6.repositories;

import com.webapp.hw6.model.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends CrudRepository<Products, Integer> {
    Iterable<Products> getAllByOrders_Id(Integer id);
}
