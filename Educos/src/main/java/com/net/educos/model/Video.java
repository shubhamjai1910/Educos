package com.net.educos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Video implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 175380012737704337L;
	
	@Id
	@Column(name="vid")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer vid;
	@Column(name="videolink")
	private String videolink;
	@Column(name="uploadersname")
	private String uploadersname;
	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
		this.vid = vid;
	}
	public String getVideolink() {
		return videolink;
	}
	public void setVideolink(String videolink) {
		this.videolink = videolink;
	}
	public String getUploadersname() {
		return uploadersname;
	}
	public void setUploadersname(String uploadersname) {
		this.uploadersname = uploadersname;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
