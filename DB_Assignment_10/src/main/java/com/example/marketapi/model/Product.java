package com.example.marketapi.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_list")
public class Product {
    @Id
    @NotNull
    @GeneratedValue
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private double price;
    @NotNull
    private double quantity;

    @ManyToOne(cascade = {CascadeType.ALL})
    Wishlist wishlist;

    @ManyToOne(cascade = {CascadeType.ALL})
    Cart cart;
}