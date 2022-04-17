package com.webapp.hw6.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class OrdersDTO {

    @JsonProperty
    Integer id;

    Integer customerId;

    @NotNull
    String orderDate;
    String shippedDate;
}
