package com.example.webjava.web;

import com.example.webjava.dto.CustomerRegistrationDTO;
import com.example.webjava.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class CustomerRegController {

    private CustomerService customerService;

    public CustomerRegController(CustomerService customerService) {
        super();
        this.customerService = customerService;
    }

    @ModelAttribute("customer")
    public CustomerRegistrationDTO customerRegistrationDTO() {
        return new CustomerRegistrationDTO();
    }

    @GetMapping
    public String showRegForm() {
        return "registration";
    }

    @PostMapping
    public String registerCustomerAcc(@ModelAttribute("customer") CustomerRegistrationDTO registrationDTO) {
        customerService.saveCustomerRegistration(registrationDTO);
        return "redirect:/registration?success";
    }
}
