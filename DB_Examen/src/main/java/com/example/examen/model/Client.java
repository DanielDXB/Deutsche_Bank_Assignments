package com.example.examen.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Client {
    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String username;

    @OneToMany
    List<Pizza> pizzaList;
}
