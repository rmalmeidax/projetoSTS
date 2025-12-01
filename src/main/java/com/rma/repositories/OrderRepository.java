package com.rma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rma.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
