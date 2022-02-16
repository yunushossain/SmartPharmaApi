package com.example.comtroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Invoice;
import com.example.service.InvoiceService;

@RestController
@CrossOrigin(origins = "*")
public class InvoiceController {
	@Autowired
	InvoiceService invoiceService;
	
	
	@PostMapping(value = "/invoice/save")
	public ResponseEntity<?> save(@RequestBody List<Invoice> entities) {
		Map<String, Object> map = new HashMap<>();
		try {
			 List<Invoice> invoices =invoiceService.saveAll(entities);
			map.put("message", "Data save successfully");
			map.put("Data", invoices);
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


}
