package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Demo.Model.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {

}
