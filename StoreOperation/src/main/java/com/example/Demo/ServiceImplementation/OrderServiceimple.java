package com.example.Demo.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Demo.Model.Order;
import com.example.Demo.Repository.OrderRepo;
import com.example.Demo.Service.OrderService;

public class OrderServiceimple implements OrderService {

	@Autowired
	OrderRepo repo;
	@Override
	public Order addcus(Order order) {
		// TODO Auto-generated method stub
		return repo.save(order);
	}

	@Override
	public List<Order> display() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	

	@Override
	public Order update(Order order) {
		// TODO Auto-generated method stub
	 return repo.save(order);
	}

	@Override
	public Void update(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
