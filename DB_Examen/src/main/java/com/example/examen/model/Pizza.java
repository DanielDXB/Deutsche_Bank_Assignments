package com.example.examen.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Pizza {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    Client client;
}
