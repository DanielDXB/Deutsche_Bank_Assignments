package com.example.swaggerpractice.controller;

import com.example.swaggerpractice.model.PaymentMethod;
import com.example.swaggerpractice.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.stereotype.Controller
@Profile("prod")
public class ProdController {

    @Autowired
    Service service;
    @PostMapping("/prod")
    public String pay(@RequestBody Long customerId, @RequestBody Long orderId,
                      @RequestBody PaymentMethod paymentMethod) {
        return service.pay(customerId, orderId, paymentMethod);
    }
}