package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase")
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pid;
	private String sname;
	private int pinvonum;
	private String ppaytype;
	private String pstdate;
	private String mname;
	private String mpaking;
	private String batchid;
	private String expdate;
	private int quantity;
	private double mrp;
	private double rate;
	private double amount;
	private double gtotal;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getGtotal() {
		return gtotal;
	}
	public void setGtotal(double gtotal) {
		this.gtotal = gtotal;
	}
	private String mgname;
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getPinvonum() {
		return pinvonum;
	}
	public void setPinvonum(int pinvonum) {
		this.pinvonum = pinvonum;
	}
	public String getPpaytype() {
		return ppaytype;
	}
	public void setPpaytype(String ppaytype) {
		this.ppaytype = ppaytype;
	}
	public String getPstdate() {
		return pstdate;
	}
	public void setPstdate(String pstdate) {
		this.pstdate = pstdate;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMpaking() {
		return mpaking;
	}
	public void setMpaking(String mpaking) {
		this.mpaking = mpaking;
	}
	public String getBatchid() {
		return batchid;
	}
	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public String getMgname() {
		return mgname;
	}
	public void setMgname(String mgname) {
		this.mgname = mgname;
	}
	
	
	

}
