package com.example.webjava.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private Long id;
    private String name;

    @ManyToOne(cascade = {CascadeType.ALL})
    Customer customer;

    public Order() {
    }

    public Order(String name) {
        super();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
