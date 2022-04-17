package com.example.swaggerpractice.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "order_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue
    @NotNull
    private Long id;
    private double price;

    @ManyToOne
    Customer customer;

    @OneToOne
    Payment payment;
}
