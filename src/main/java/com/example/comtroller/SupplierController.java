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



import com.example.model.Supplier;
import com.example.service.SupplierService;



@RestController
@CrossOrigin(origins = "*")
public class SupplierController {
	
	@Autowired
	public SupplierService supplierService;
	
	@PostMapping(value = "/supplier/save")
	public ResponseEntity<?> save(@RequestBody Supplier entity) {
		Map<String, Object> map = new HashMap<>();
		try {
			Supplier supplier = supplierService.save(entity);
			map.put("message", "Data save successfully");
			map.put("Data", supplier);
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
	
	@GetMapping(value = "/supplier/getAll")
	public ResponseEntity<?> getSupplier() {
		Map<String, Object> map = new HashMap<>();
		try {
			List<Supplier> supplier = (List<Supplier>) supplierService.findAll();
			map.put("message", "Data get successfully");
			map.put("Data", supplier);
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


	@PostMapping(value = "/supplier/update")
	public ResponseEntity<?> update(@RequestBody Supplier entity) {
		Map<String, Object> map = new HashMap<>();
		try {
			Supplier supplier = supplierService.save(entity);
			map.put("message", "Data updated successfully");
			map.put("Data", supplier);
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

	@GetMapping(value = "/supplier/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long sid) {
		Map<String, Object> map = new HashMap<>();
		Supplier supplier = supplierService.findById(sid).get();
		try {
			supplierService.delete(supplier);
			map.put("message", "Data deleted successfully");
			map.put("Data", supplier);
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
	
	
	@GetMapping(value = "/supplier/search")
	public ResponseEntity<?> search(@RequestParam(value = "searchText") String searchText) {
		Map<String, Object> map = new HashMap<>();
		try {
			List<Supplier> supplierlist = supplierService.searchSupplier(searchText);
			map.put("message", "Data get successfully");
			map.put("Data", supplierlist);
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
