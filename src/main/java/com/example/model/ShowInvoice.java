package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "showinvoice")
public class ShowInvoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String customerName;
	private String date;
	private Double totalAmount;
	private Double totalDiscount;
	private Double netTotal;

	public ShowInvoice() {
		super();
	}

	public ShowInvoice(long id, String customerName, String date, Double totalAmount, Double totalDiscount,
			Double netTotal) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.date = date;
		this.totalAmount = totalAmount;
		this.totalDiscount = totalDiscount;
		this.netTotal = netTotal;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(Double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public Double getNetTotal() {
		return netTotal;
	}

	public void setNetTotal(Double netTotal) {
		this.netTotal = netTotal;
	}

	
}
