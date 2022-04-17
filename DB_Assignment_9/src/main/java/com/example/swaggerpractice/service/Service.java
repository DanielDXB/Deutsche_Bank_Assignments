package com.example.swaggerpractice.service;

import com.example.swaggerpractice.model.PaymentMethod;
import com.example.swaggerpractice.repository.CustomerRepository;
import com.example.swaggerpractice.repository.OrderRepository;
import com.example.swaggerpractice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    PaymentRepository paymentRepository;

    public String pay(Long customerId, Long orderId, PaymentMethod paymentMethod) {
        if (orderRepository.getById(orderId).getPrice() < 10000.0)
            return "Customer with id: " + customerRepository.getById(customerId) + "payed: " + orderRepository.getById(orderId).getPrice() + "with: " + paymentMethod;
        else if (paymentMethod != PaymentMethod.CARD) {
            return "Invalid payment method!";
        }
        return "Customer with id: " + customerRepository.getById(customerId) + "payed: " + orderRepository.getById(orderId).getPrice() + "with: " + PaymentMethod.CARD;
    }
}
