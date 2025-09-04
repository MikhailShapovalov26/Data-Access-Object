package ru.netology.dataaccessobject.service;

import org.springframework.stereotype.Service;
import ru.netology.dataaccessobject.model.Customer;
import ru.netology.dataaccessobject.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public List<String> findCustomerByProductName(String name) {
        return customerRepository.getProductName(name);
    }


}
