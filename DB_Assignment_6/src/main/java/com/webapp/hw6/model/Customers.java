package com.webapp.hw6.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "customers")
public class Customers {

    @Id
    @NotNull
    @GeneratedValue
    private Integer id;

    @NotNull
    private String username;
    @NotNull
    private String city;
    @NotNull
    private String country;

    @OneToMany
    public List<Orders> orders;
}