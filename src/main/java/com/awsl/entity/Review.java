package com.awsl.entity;

import java.sql.Timestamp;

public class Review {
	private int id;
	private String content;
	private int uid;
	private int pid;
	private Timestamp createDate;
	public Review() {
		super();
	}
	public Review(int id, String content, int uid, int pid, Timestamp createDate) {
		super();
		this.id = id;
		this.content = content;
		this.uid = uid;
		this.pid = pid;
		this.createDate = createDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", content=" + content + ", uid=" + uid + ", pid=" + pid + ", createDate="
				+ createDate + "]";
	}
	
	

}
