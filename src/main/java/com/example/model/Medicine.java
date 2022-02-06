package com.example.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicine")
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long mid;
	private String mname;
	private int mquantity;
	private double mprice;
	private String doa;
	private String doe;
	private String sname;
	public long getMid() {
		return mid;
	}
	public void setMid(long mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMquantity() {
		return mquantity;
	}
	public void setMquantity(int mquantity) {
		this.mquantity = mquantity;
	}
	public double getMprice() {
		return mprice;
	}
	public void setMprice(double mprice) {
		this.mprice = mprice;
	}
	public String getDoa() {
		return doa;
	}
	public void setDoa(String doa) {
		this.doa = doa;
	}
	public String getDoe() {
		return doe;
	}
	public void setDoe(String doe) {
		this.doe = doe;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	
	
	
	

}
