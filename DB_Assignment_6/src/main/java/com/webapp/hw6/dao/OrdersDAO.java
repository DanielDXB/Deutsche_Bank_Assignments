package com.webapp.hw6.dao;

import com.webapp.hw6.model.Orders;
import com.webapp.hw6.repositories.OrdersRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class OrdersDAO implements DAO<Orders>{
    private final OrdersRepository ordersRepository;

    @Override
    public Optional<Orders> get(Integer id) {
        return ordersRepository.findById(id);
    }

    @Override
    public void create(Orders orders) {
        ordersRepository.save(orders);
    }

    @Override
    public void delete(Orders orders) {
        ordersRepository.delete(orders);
    }

    @Override
    public void update(Orders orders) {
        ordersRepository.save(orders);
    }
}
