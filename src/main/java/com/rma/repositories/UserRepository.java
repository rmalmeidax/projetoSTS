package com.rma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rma.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
