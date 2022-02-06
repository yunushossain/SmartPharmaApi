package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cid;
	private String cname;
	private String ccontact;
	private String caddress;
	private String cdname;
	private String cdaddress;
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcontact() {
		return ccontact;
	}
	public void setCcontact(String ccontact) {
		this.ccontact = ccontact;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCdname() {
		return cdname;
	}
	public void setCdname(String cdname) {
		this.cdname = cdname;
	}
	public String getCdaddress() {
		return cdaddress;
	}
	public void setCdaddress(String cdaddress) {
		this.cdaddress = cdaddress;
	}
	

}
