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

import com.example.model.Medicine;
import com.example.model.Purchase;
import com.example.service.PurchaseService;

@RestController
@CrossOrigin(origins = "*")
public class PurchaseController {
	@Autowired
	PurchaseService purchaseService;
	
	

	@PostMapping(value = "/purchase/save")
	public ResponseEntity<?> save(@RequestBody Purchase entity) {
		Map<String, Object> map = new HashMap<>();
		try {
			Purchase purchase = purchaseService.save(entity);
			map.put("message", "Data save successfully");
			map.put("Data", purchase);
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
	
	@GetMapping(value = "/purchase/findById/{id}")
	public ResponseEntity<?> findById(@PathVariable(value = "pid") Long pid) {
		Map<String, Object> map = new HashMap<>();
		try {
			Purchase purchase = purchaseService.findById(pid).get();
			map.put("message", "Data get successfully");
			map.put("Data", purchase);
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
	
	
	@GetMapping(value = "/purchase/getAll")
	public ResponseEntity<?> getMedicine() {
		Map<String, Object> map = new HashMap<>();
		try {
			List<Purchase> purchase =(List<Purchase>) purchaseService.findAll();
			map.put("message", "Data get successfully");
			map.put("Data", purchase);
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
	
	@PostMapping(value = "/purchase/update")
	public ResponseEntity<?> update(@RequestBody Purchase entity) {
		Map<String, Object> map = new HashMap<>();
		try {
			Purchase purchase = purchaseService.save(entity);
			map.put("message", "Data updated successfully");
			map.put("Data", purchase);
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
	
	@GetMapping(value = "/purchase/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "pid") Long pid) {
		Map<String, Object> map = new HashMap<>();
		Purchase purchase = purchaseService.findById(pid).get();
		try {
			purchaseService.delete(purchase);
			map.put("message", "Data deleted successfully");
			map.put("Data", purchase);
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
	
	
	
	

}
