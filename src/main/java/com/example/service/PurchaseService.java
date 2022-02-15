package com.example.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Medicine;
import com.example.model.Purchase;

@Repository
public interface PurchaseService extends JpaRepository<Purchase, Long> {
	
	

}
