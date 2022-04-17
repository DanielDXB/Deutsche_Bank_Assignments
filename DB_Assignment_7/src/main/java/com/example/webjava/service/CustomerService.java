package com.example.webjava.service;

import com.example.webjava.dto.CustomerRegistrationDTO;
import com.example.webjava.model.Customer;
import com.example.webjava.model.Order;
import com.example.webjava.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;

    public CustomerService(CustomerRepository customerRepository) {
        super();
        this.customerRepository = customerRepository;
    }

    public Customer saveCustomerRegistration(CustomerRegistrationDTO customerRegistrationDTO) {
        Customer customer = new Customer(customerRegistrationDTO.getFirstName(), customerRegistrationDTO.getLastName(),
                customerRegistrationDTO.getUsername(), customerRegistrationDTO.getPassword());

        return customerRepository.save(customer);
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer = customerRepository.findCustomerByUsername(username);
        if (customer == null)
            throw new UsernameNotFoundException("Invalid username or password");

        return new org.springframework.security.core.userdetails.User(customer.getUsername(), customer.getPassword(), null);
    }

//    private Collection<? extends GrantedAuthority> mapOrdersToAuthorities(Collection<Order> orders) {
//        return orders.stream().map(order -> new SimpleGrantedAuthority(order.getName())).collect(Collectors.toList());
//    }
}
