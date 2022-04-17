package com.example.swaggerpractice.repository;

import com.example.swaggerpractice.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
