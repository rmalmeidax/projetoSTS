package com.rma.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rma.entities.Order;
import com.rma.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	
	public List<Order> findAll(){
		return repository.findAll();
		}
	
	public Order findById (Long id) {
	return repository.findById(id).orElseThrow(() -> new RuntimeException("ID não encontrado."));
	
	}

}
