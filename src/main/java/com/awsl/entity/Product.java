package com.awsl.entity;

import java.sql.Timestamp;

public class Product {
	private int id;
	private String name;
	private String subTitle;
	private double orignalPrice;
	private double promotePrice;
	private int stock;
	private int cid;
	private Timestamp createDate;
	public Product() {
		super();
	}
	public Product(int id, String name, String subTitle, double orignalPrice, double promotePrice, int stock, int cid,
			Timestamp createDate) {
		super();
		this.id = id;
		this.name = name;
		this.subTitle = subTitle;
		this.orignalPrice = orignalPrice;
		this.promotePrice = promotePrice;
		this.stock = stock;
		this.cid = cid;
		this.createDate = createDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public double getOrignalPrice() {
		return orignalPrice;
	}
	public void setOrignalPrice(double orignalPrice) {
		this.orignalPrice = orignalPrice;
	}
	public double getPromotePrice() {
		return promotePrice;
	}
	public void setPromotePrice(double promotePrice) {
		this.promotePrice = promotePrice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", subTitle=" + subTitle + ", orignalPrice=" + orignalPrice
				+ ", promotePrice=" + promotePrice + ", stock=" + stock + ", cid=" + cid + ", createDate=" + createDate
				+ "]";
	}
	
	
	

}
