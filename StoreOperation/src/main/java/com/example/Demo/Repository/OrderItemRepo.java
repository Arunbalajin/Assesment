package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Demo.Model.OrderItem;

public interface OrderItemRepo extends JpaRepository<OrderItem, Integer>{

	void saveAll(OrderItem orderitem);

}
