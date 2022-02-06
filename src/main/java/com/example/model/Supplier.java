package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supplier")
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  	private long sid;
		private String sname;
		private String semail;
		private String scontact;
		private String saddress;
		public long getSid() {
			return sid;
		}
		public void setSid(long sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getSemail() {
			return semail;
		}
		public void setSemail(String semail) {
			this.semail = semail;
		}
		public String getScontact() {
			return scontact;
		}
		public void setScontact(String scontact) {
			this.scontact = scontact;
		}
		public String getSaddress() {
			return saddress;
		}
		public void setSaddress(String saddress) {
			this.saddress = saddress;
		} 
		
	

}
