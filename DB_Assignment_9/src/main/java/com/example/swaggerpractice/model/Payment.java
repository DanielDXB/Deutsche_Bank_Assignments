package com.example.swaggerpractice.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue
    @NotNull
    private Long id;
    private PaymentMethod paymentMethod;

    @OneToOne
    Order order;
}
