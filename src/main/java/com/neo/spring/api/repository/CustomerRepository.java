package com.neo.spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neo.spring.api.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
