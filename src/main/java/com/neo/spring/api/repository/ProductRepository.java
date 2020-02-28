package com.neo.spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neo.spring.api.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
