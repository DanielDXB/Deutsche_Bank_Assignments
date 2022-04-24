package com.example.marketapi.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_cart")
public class Cart {
    @Id
    @NotNull
    @GeneratedValue
    private Integer id;
    private int orderDate;

    @ManyToOne(cascade = {CascadeType.ALL}, fetch =  FetchType.EAGER)
    User user;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Product> productList;
}
