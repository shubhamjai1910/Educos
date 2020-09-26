package com.net.educos.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Faculty implements Serializable {
	
	/**
	 * 
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = -3198343765840684155L;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int fid;
	private String fname;
	private String fsubjects;
	private String faddress;
	private String femail;
	private String fgender;
	private String fcontact;
	private String fpassword;
	private String frepassword;
	private int roleid;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFsubjects() {
		return fsubjects;
	}
	public void setFsubjects(String fsubjects) {
		this.fsubjects = fsubjects;
	}
	public String getFaddress() {
		return faddress;
	}
	public void setFaddress(String faddress) {
		this.faddress = faddress;
	}
	public String getFemail() {
		return femail;
	}
	public void setFemail(String femail) {
		this.femail = femail;
	}
	public String getFgender() {
		return fgender;
	}
	public void setFgender(String fgender) {
		this.fgender = fgender;
	}
	public String getFcontact() {
		return fcontact;
	}
	public void setFcontact(String fcontact) {
		this.fcontact = fcontact;
	}
	public String getFpassword() {
		return fpassword;
	}
	public void setFpassword(String fpassword) {
		this.fpassword = fpassword;
	}
	public String getFrepassword() {
		return frepassword;
	}
	public void setFrepassword(String frepassword) {
		this.frepassword = frepassword;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	

}
