package com.example.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Customer;


@Repository
public interface CustomerService extends CrudRepository<Customer, Long> {
	@Query("SELECT c from Customer c where c.cname like %:searchText% or c.cid like %:searchText%")
	List<Customer> searchCustomer(String searchText);
	
	
	List<Customer> findTop5ByCnameOrderByCnameAsc(String cname);
	List<Customer> findTop5ByCnameContains(String cnameQuery);

}
