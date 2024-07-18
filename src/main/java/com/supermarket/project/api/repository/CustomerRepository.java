package com.supermarket.project.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.supermarket.project.api.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    
}
