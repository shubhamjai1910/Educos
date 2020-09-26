package com.net.educos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="result")
public class Results implements Serializable

{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
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
	private Integer sid;
	@Column(name="name") 
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="assignmentrecord")
	private String assignmentrecord;
	@Column(name="quizrecord")
	private String quizrecord;
	@Column(name="assignmentattempt")
	private String assignmentattempt;
	@Column(name="quizattempt")
	private String quizattempt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	
	public String getAssignmentrecord() {
		return assignmentrecord;
	}
	public void setAssignmentrecord(String assignmentrecord) {
		this.assignmentrecord = assignmentrecord;
	}
	public String getQuizrecord() {
		return quizrecord;
	}
	public void setQuizrecord(String quizrecord) {
		this.quizrecord = quizrecord;
	}
	public String getAssignmentattempt() {
		return assignmentattempt;
	}
	public void setAssignmentattempt(String assignmentattempt) {
		this.assignmentattempt = assignmentattempt;
	}
	public String getQuizattempt() {
		return quizattempt;
	}
	public void setQuizattempt(String quizattempt) {
		this.quizattempt = quizattempt;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
}