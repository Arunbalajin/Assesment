package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Demo.Model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
