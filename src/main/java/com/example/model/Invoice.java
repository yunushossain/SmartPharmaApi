package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long invid;
	private String cname;
	private String caddress;
	private String cemail;
	private String invpaytype;
	private String invdate;
	private String ccontact;
	private String cdname;
	private String mname;
	private String batchid;
	private int avalaquantity;
	private String expdate;
	private int invquantity;
	private double mrp;
	private double discount;
	private double invtotal;
	private double invgtotal;
	private double invdistotal;
	private double invnettotal;
	private double invpaidamount;
	private double invchangeamount;
	public long getInvid() {
		return invid;
	}
	public void setInvid(long invid) {
		this.invid = invid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getInvpaytype() {
		return invpaytype;
	}
	public void setInvpaytype(String invpaytype) {
		this.invpaytype = invpaytype;
	}
	public String getInvdate() {
		return invdate;
	}
	public void setInvdate(String invdate) {
		this.invdate = invdate;
	}
	public String getCcontact() {
		return ccontact;
	}
	public void setCcontact(String ccontact) {
		this.ccontact = ccontact;
	}
	public String getCdname() {
		return cdname;
	}
	public void setCdname(String cdname) {
		this.cdname = cdname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getBatchid() {
		return batchid;
	}
	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}
	public int getAvalaquantity() {
		return avalaquantity;
	}
	public void setAvalaquantity(int avalaquantity) {
		this.avalaquantity = avalaquantity;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public int getInvquantity() {
		return invquantity;
	}
	public void setInvquantity(int invquantity) {
		this.invquantity = invquantity;
	}
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getInvtotal() {
		return invtotal;
	}
	public void setInvtotal(double invtotal) {
		this.invtotal = invtotal;
	}
	public double getInvgtotal() {
		return invgtotal;
	}
	public void setInvgtotal(double invgtotal) {
		this.invgtotal = invgtotal;
	}
	public double getInvdistotal() {
		return invdistotal;
	}
	public void setInvdistotal(double invdistotal) {
		this.invdistotal = invdistotal;
	}
	public double getInvnettotal() {
		return invnettotal;
	}
	public void setInvnettotal(double invnettotal) {
		this.invnettotal = invnettotal;
	}
	public double getInvpaidamount() {
		return invpaidamount;
	}
	public void setInvpaidamount(double invpaidamount) {
		this.invpaidamount = invpaidamount;
	}
	public double getInvchangeamount() {
		return invchangeamount;
	}
	public void setInvchangeamount(double invchangeamount) {
		this.invchangeamount = invchangeamount;
	}
	
	
	 

}
