package com.example.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.model.Supplier;

@Repository
public interface SupplierService extends CrudRepository<Supplier, Long> {
	@Query("SELECT s from Supplier s where s.sname like %:searchText% or s.sid like %:searchText%")
	List<Supplier> searchSupplier(String searchText);

}
