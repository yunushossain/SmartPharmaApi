package com.example.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.model.User;

public interface UserService extends JpaRepository<User, Integer> {
	List<User> findByUsername(String username);

}
