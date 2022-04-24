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
@Table(name = "user_table")
public class User {
    @Id
    @NotNull
    @GeneratedValue
    private Integer id;
    @NotNull
    private String name;

    @OneToOne
    private Wishlist wishlist;

    @OneToMany(cascade = {CascadeType.ALL}, fetch =  FetchType.EAGER)
    private List<Cart> userCart;
}
