package com.pruebaback.pruebaback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebaback.pruebaback.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
