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
import com.example.service.MedicineService;

@RestController
@CrossOrigin(origins = "*")
public class MedicineController {
	@Autowired
	MedicineService medicineService;
	
	
	@PostMapping(value = "/medicine/save")
	public ResponseEntity<?> save(@RequestBody Medicine entity) {
		Map<String, Object> map = new HashMap<>();
		try {
			Medicine medicine = medicineService.save(entity);
			map.put("message", "Data save successfully");
			map.put("Data", medicine);
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
	
	@GetMapping(value = "/medicine/findById/{id}")
	public ResponseEntity<?> findById(@PathVariable(value = "mid") Long mid) {
		Map<String, Object> map = new HashMap<>();
		try {
			Medicine medicine = medicineService.findById(mid).get();
			map.put("message", "Data get successfully");
			map.put("Data", medicine);
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
	
	
	@GetMapping(value = "/medicine/getAll")
	public ResponseEntity<?> getMedicine() {
		Map<String, Object> map = new HashMap<>();
		try {
			List<Medicine> medicine =(List<Medicine>) medicineService.findAll();
			map.put("message", "Data get successfully");
			map.put("Data", medicine);
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
	
	@PostMapping(value = "/medicine/update")
	public ResponseEntity<?> update(@RequestBody Medicine entity) {
		Map<String, Object> map = new HashMap<>();
		try {
			Medicine medicine = medicineService.save(entity);
			map.put("message", "Data updated successfully");
			map.put("Data", medicine);
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
	
	@GetMapping(value = "/medicine/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long mid) {
		Map<String, Object> map = new HashMap<>();
		Medicine medicine = medicineService.findById(mid).get();
		try {
			medicineService.delete(medicine);
			map.put("message", "Data deleted successfully");
			map.put("Data", medicine);
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
	
	
	@GetMapping(value = "/medicine/search")
	public ResponseEntity<?> search(@RequestParam(value = "searchText") String searchText) {
		Map<String, Object> map = new HashMap<>();
		try {
			List<Medicine> medicinelist = medicineService.searchMedicine(searchText);
			map.put("message", "Data get successfully");
			map.put("Data", medicinelist);
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
