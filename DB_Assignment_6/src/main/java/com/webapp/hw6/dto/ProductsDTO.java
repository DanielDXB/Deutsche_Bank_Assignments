package com.webapp.hw6.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class ProductsDTO {

    @JsonProperty
    Integer id;

    Integer orderId;

    @NotNull
    int price;
}
