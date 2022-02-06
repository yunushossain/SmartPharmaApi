package com.example.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.model.Medicine;

@Repository
public interface MedicineService extends CrudRepository<Medicine, Long> {

	@Query("SELECT m from Medicine m where m.mname like %:searchText% or m.mid like %:searchText%")
	List<Medicine> searchMedicine(String searchText);

}
