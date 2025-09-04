package ru.netology.dataaccessobject.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.dataaccessobject.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping
public class Controller {
    private final CustomerService customerService;

    public Controller(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping("/products/fetch-product")
    public List<String> nameCustomer(@RequestParam String name) {
        return customerService.findCustomerByProductName(name);
    }
}
