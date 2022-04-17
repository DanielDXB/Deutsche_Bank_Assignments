package com.webapp.hw6.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class CustomersDTO {
    @JsonProperty
    Integer id;

    @NotNull
    String username;
    @NotNull
    String city;
    @NotNull
    String country;
}
