package com.awsl.entity;

public class Productimage {
	private int id;
	private int pid;
	private String type;
	public Productimage(int id, int pid, String type) {
		super();
		this.id = id;
		this.pid = pid;
		this.type = type;
	}
	public Productimage() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Productimage [id=" + id + ", pid=" + pid + ", type=" + type + "]";
	}
	
	

}
