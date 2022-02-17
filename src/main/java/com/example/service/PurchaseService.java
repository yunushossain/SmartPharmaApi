package com.example.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Purchase;

@Repository
public interface PurchaseService extends JpaRepository<Purchase, Long> {

	@Query("SELECT p from Purchase p where p.mname like %:searchText% or p.pinvonum like %:searchText%")
	List<Purchase> searchPurchase(String searchText);
	
	List<Purchase> findTop5ByMnameOrderByMnameAsc(String mname);
	List<Purchase> findTop5ByMnameContains(String mnameQuery);

}
