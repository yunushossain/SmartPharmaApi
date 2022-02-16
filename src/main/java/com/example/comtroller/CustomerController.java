package com.example.comtroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;

import com.example.service.CustomerService;



@RestController
@CrossOrigin(origins = "*")
public class CustomerController {
	
	@Autowired
	public CustomerService customerService;
	
	@PostMapping(value = "/customer/save")
	public ResponseEntity<?> save(@RequestBody Customer entity) {
		Map<String, Object> map = new HashMap<>();
		try {
			Customer customer = customerService.save(entity);
			map.put("message", "Data save successfully");
			map.put("Data", customer);
			map.put("Status code", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "Data saved failed");
			map.put("Data", null);
			map.put("Status code", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}
	
	@GetMapping(value = "/customer/getAll")
	public ResponseEntity<?> getCustomer() {
		Map<String, Object> map = new HashMap<>();
		try {
			List<Customer> customer = (List<Customer>) customerService.findAll();
			map.put("message", "Data get successfully");
			map.put("Data", customer);
			map.put("Status code", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "Data fetch failed");
			map.put("Data", null);
			map.put("Status code", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}
	


	@PostMapping(value = "/customer/update")
	public ResponseEntity<?> update(@RequestBody Customer entity) {
		Map<String, Object> map = new HashMap<>();
		try {
			Customer customer = customerService.save(entity);
			map.put("message", "Data updated successfully");
			map.put("Data", customer);
			map.put("Status code", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "Data updated failed");
			map.put("Data", null);
			map.put("Status code", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}

	@GetMapping(value = "/customer/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long cid) {
		Map<String, Object> map = new HashMap<>();
		Customer customer = customerService.findById(cid).get();
		try {
			customerService.delete(customer);
			map.put("message", "Data deleted successfully");
			map.put("Data", customer);
			map.put("Status code", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "Data deletation failed");
			map.put("Data", null);
			map.put("Status code", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}
	

	@GetMapping(value = "/customer/search")
	public ResponseEntity<?> search(@RequestParam(value = "searchText") String searchText) {
		Map<String, Object> map = new HashMap<>();
		try {
			List<Customer> customerlist = customerService.findTop5ByCnameContains(searchText);
			map.put("message", "Data get successfully");
			map.put("Data", customerlist);
			map.put("Status code", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "Data fetch failed");
			map.put("Data", null);
			map.put("Status code", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}
	
	
	
}
