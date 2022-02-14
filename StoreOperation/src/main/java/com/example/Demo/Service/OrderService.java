package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Model.Customer;
import com.example.Demo.Model.Order;

public interface OrderService {
	public Order addcus(Order order );
	public List<Order> display();
	public void delete(int id);
	public Void update(int id);
	Order update(Order order);
}
