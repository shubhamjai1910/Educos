package com.net.educos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student implements Serializable 
{
/**
	 * 
	 */
	private static final long serialVersionUID = 8830600223575654059L;
@Id
@Column(name="sid")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int sid;
@Column(name="sname")
private String sname;
@Column(name="stream")
private String stream;
@Column(name="sgender")
private String sgender;
@Column(name="saddress")
private String saddress;
@Column(name="scontact")
private String scontact;
@Column(name="semail")
private String semail;
@Column(name="spassword")
private String spassword;
@Column(name="srepassword") 
private String srepassword;
@Column(name = "roleid")
private int roleid;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
public String getSgender() {
	return sgender;
}
public void setSgender(String sgender) {
	this.sgender = sgender;
}
public String getSaddress() {
	return saddress;
}
public void setSaddress(String saddress) {
	this.saddress = saddress;
}
public String getScontact() {
	return scontact;
}
public void setScontact(String scontact) {
	this.scontact = scontact;
}
public String getSemail() {
	return semail;
}
public void setSemail(String semail) {
	this.semail = semail;
}
public String getSpassword() {
	return spassword;
}
public void setSpassword(String spassword) {
	this.spassword = spassword;
}
public String getSrepassword() {
	return srepassword;
}
public void setSrepassword(String srepassword) {
	this.srepassword = srepassword;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
public int getRoleid() {
	return roleid;
}
public void setRoleid(int roleid) {
	this.roleid = roleid;
}



	
	
}
