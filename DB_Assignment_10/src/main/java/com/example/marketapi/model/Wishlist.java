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
@Table(name = "user_wishlist")
public class Wishlist {
    @Id
    @NotNull
    @GeneratedValue
    private Integer id;

    @OneToOne
    User user;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Product> productList;
}
