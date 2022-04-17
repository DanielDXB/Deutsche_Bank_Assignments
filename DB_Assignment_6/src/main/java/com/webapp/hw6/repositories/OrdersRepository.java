package com.webapp.hw6.repositories;

import com.webapp.hw6.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Integer> {
    Iterable<Orders> getAllByCustomers_Id(Integer id);
}
