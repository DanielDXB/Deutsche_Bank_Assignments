package com.webapp.hw6.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Products {

    @Id
    @NotNull
    @GeneratedValue
    private Integer id;

    @NotNull
    private int price;

    @ManyToOne
    Orders orders;
}
