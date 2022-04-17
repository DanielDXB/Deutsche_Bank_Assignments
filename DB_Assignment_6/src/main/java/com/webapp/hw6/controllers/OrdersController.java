package com.webapp.hw6.controllers;

import com.webapp.hw6.model.Orders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrdersController {

    @GetMapping("/view6")
    public ModelAndView allOrdersView() {
        List<Orders> ordersList = new ArrayList<>();
        ordersList.add(Orders.builder().id(1).orderDate("22/11/2001").shippedDate("23/12/2001").build());
        ordersList.add(Orders.builder().id(2).orderDate("22/12/2001").shippedDate("23/12/2001").build());
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("customers", ordersList);
        return modelAndView;
    }

    @GetMapping("/view7")
    public ModelAndView OrderByIdView() {
        List<Orders> ordersList = new ArrayList<>();
        List<Orders> ordersListFiltered = new ArrayList<>();
        ordersList.add(Orders.builder().id(1).orderDate("22/11/2001").shippedDate("23/12/2001").build());
        ordersList.add(Orders.builder().id(2).orderDate("22/12/2001").shippedDate("23/12/2001").build());
        ModelAndView modelAndView = new ModelAndView("index");
        for (var order : ordersList) {
            if (order.getId() == 1) {
                ordersListFiltered.add(order);
            }
        }
        modelAndView.addObject("customers", ordersListFiltered);
        return modelAndView;
    }
}
