package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicine")
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long mid;
	private String mname;
	private String mgname;
	private String mpaking;
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
	public String getMgname() {
		return mgname;
	}
	public void setMgname(String mgname) {
		this.mgname = mgname;
	}
	public String getMpaking() {
		return mpaking;
	}
	public void setMpaking(String mpaking) {
		this.mpaking = mpaking;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

	

}
