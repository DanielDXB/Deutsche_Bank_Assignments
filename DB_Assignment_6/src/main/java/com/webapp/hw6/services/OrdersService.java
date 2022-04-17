package com.webapp.hw6.services;

import com.webapp.hw6.model.Orders;
import com.webapp.hw6.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {
    @Autowired
    OrdersRepository ordersRepository;

    public Iterable<Orders> getAllOrders() {
        return ordersRepository.findAll();
    }

    public Orders getOrderById(Integer id) {
        return ordersRepository.findById(id).get();
    }

    public void deleteOrderById(Integer id) {
        ordersRepository.deleteById(id);
    }

    public void updateOrder(Orders order) {
        ordersRepository.save(order);
    }

    public Orders saveOrder(Orders order) {
        return ordersRepository.save(order);
    }

    public Iterable<Orders> getAllOrdersForCustomerId(Integer customerId) {
        return ordersRepository.getAllByCustomers_Id(customerId);
    }
}
