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
import org.springframework.web.bind.annotation.RestController;


import com.example.model.Invoice;
import com.example.model.Medicine;
import com.example.model.ShowInvoice;
import com.example.service.InvoiceService;
import com.example.service.ShowInvoiceRepository;

@RestController
@CrossOrigin(origins = "*")
public class InvoiceController {
	@Autowired
	InvoiceService invoiceService;
	@Autowired
	ShowInvoiceRepository showInvoiceRepository;
	
	
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
	
	
	@PostMapping(value = "/showinvoice/save")
	public ResponseEntity<?> save(@RequestBody ShowInvoice  showInvoice) {
		Map<String, Object> map = new HashMap<>();
		try {
			ShowInvoice showInvoices =showInvoiceRepository.save(showInvoice);
			map.put("message", "Data save successfully");
			map.put("Data", showInvoices);
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

	

	@GetMapping(value = "/showinvoice/getAll")
	public ResponseEntity<?> getMedicine() {
		Map<String, Object> map = new HashMap<>();
		try {
			List<ShowInvoice> showInvoices =(List<ShowInvoice>) showInvoiceRepository.findAll();
			map.put("message", "Data get successfully");
			map.put("Data", showInvoices);
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
	
	
	@GetMapping(value = "/showinvoice/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
		Map<String, Object> map = new HashMap<>();
		ShowInvoice showInvoice = showInvoiceRepository.findById(id).get();
		try {
			showInvoiceRepository.delete(showInvoice);
			map.put("message", "Data deleted successfully");
			map.put("Data", showInvoice);
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
