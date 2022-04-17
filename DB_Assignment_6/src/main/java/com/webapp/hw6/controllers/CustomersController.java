package com.webapp.hw6.controllers;

import com.webapp.hw6.model.Customers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomersController {

    @GetMapping("/view")
    public ModelAndView allCustomersView() {
        List<Customers> customersList = new ArrayList<>();
        customersList.add(Customers.builder().id(1).username("test1").city("bucharest").country("romania").build());
        customersList.add(Customers.builder().id(2).username("test2").city("bucharest").country("romania").build());
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("customers", customersList);
        return modelAndView;
    }

    @GetMapping("/view2")
    public ModelAndView getCustomerByIdView() {
        List<Customers> customersList = new ArrayList<>();
        List<Customers> customersListFiltered = new ArrayList<>();
        customersList.add(Customers.builder().id(1).username("test1").city("bucharest").country("romania").build());
        customersList.add(Customers.builder().id(2).username("test2").city("bucharest").country("romania").build());

        ModelAndView modelAndView = new ModelAndView("index");
        for (var customer : customersList) {
            if (customer.getId() == 1) {
                customersListFiltered.add(customer);
            }
        }
        modelAndView.addObject("customers", customersListFiltered);
        return modelAndView;
    }

    @GetMapping("/view3")
    public ModelAndView getCustomerByCountryView() {
        List<Customers> customersList = new ArrayList<>();
        List<Customers> customersListFiltered = new ArrayList<>();
        customersList.add(Customers.builder().id(1).username("test1").city("bucharest").country("romania").build());
        customersList.add(Customers.builder().id(2).username("test2").city("bucharest").country("romania").build());

        ModelAndView modelAndView = new ModelAndView("index");
        for (var customer : customersList) {
            if (customer.getCountry().equals("romania")) {
                customersListFiltered.add(customer);
            }
        }
        modelAndView.addObject("customers", customersListFiltered);
        return modelAndView;
    }

    @GetMapping("/view4")
    public ModelAndView getCustomerByCityView() {
        List<Customers> customersList = new ArrayList<>();
        List<Customers> customersListFiltered = new ArrayList<>();
        customersList.add(Customers.builder().id(1).username("test1").city("bucharest").country("romania").build());
        customersList.add(Customers.builder().id(2).username("test2").city("bucharest").country("romania").build());
        customersList.add(Customers.builder().id(3).username("test3").city("cluj-napoca").country("altarara").build());
        customersList.add(Customers.builder().id(4).username("test4").city("timisoara").country("ungaria").build());

        ModelAndView modelAndView = new ModelAndView("index");
        for (var customer : customersList) {
            if (customer.getCity().equals("bucharest")) {
                customersListFiltered.add(customer);
            }
        }
        modelAndView.addObject("customers", customersListFiltered);
        return modelAndView;
    }

    @GetMapping("/view5")
    public ModelAndView getCustomerByUsernameView() {
        List<Customers> customersList = new ArrayList<>();
        List<Customers> customersListFiltered = new ArrayList<>();
        customersList.add(Customers.builder().id(1).username("test1").city("bucharest").country("romania").build());
        customersList.add(Customers.builder().id(2).username("test2").city("bucharest").country("romania").build());
        customersList.add(Customers.builder().id(3).username("test3").city("cluj-napoca").country("altarara").build());
        customersList.add(Customers.builder().id(4).username("test4").city("timisoara").country("ungaria").build());

        ModelAndView modelAndView = new ModelAndView("index");
        for (var customer : customersList) {
            if (customer.getUsername().startsWith("test")) {
                customersListFiltered.add(customer);
            }
        }
        modelAndView.addObject("customers", customersListFiltered);
        return modelAndView;
    }
}
