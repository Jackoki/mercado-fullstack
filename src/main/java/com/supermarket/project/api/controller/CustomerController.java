package com.supermarket.project.api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.supermarket.project.api.model.Customer;
import com.supermarket.project.api.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@CrossOrigin(origins = "*")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;
    
    @PostMapping("/")
    public Customer register(@RequestBody Customer c){
        return customerRepository.save(c);
    }

    @GetMapping("/")
    public Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }
    
    @PutMapping("/")
    public Customer edit(@RequestBody Customer c){
        return customerRepository.save(c);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Integer id){
        customerRepository.deleteById(id);
    }


}