package com.awsl.entity;

public class Propertyvalue {
	private int id;
	private int pid;
	private int ptid;
	private String value;
	public Propertyvalue(int id, int pid, int ptid, String value) {
		super();
		this.id = id;
		this.pid = pid;
		this.ptid = ptid;
		this.value = value;
	}
	@Override
	public String toString() {
		return "Propertyvalue [id=" + id + ", pid=" + pid + ", ptid=" + ptid + ", value=" + value + "]";
	}
	public Propertyvalue() {
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
	public int getPtid() {
		return ptid;
	}
	public void setPtid(int ptid) {
		this.ptid = ptid;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	

}
