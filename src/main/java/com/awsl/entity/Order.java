package com.awsl.entity;

import java.sql.Timestamp;


public class Order {
	private int id;
	private String orderCode;
	private String address;
	private String post;
	private String receiver;
	private String mobile;
	private String userMessage;
	private Timestamp payDate;
	private Timestamp deliveryDate;
	private Timestamp confirmDate;
	private int uid;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUserMessage() {
		return userMessage;
	}
	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}
	public Timestamp getPayDate() {
		return payDate;
	}
	public void setPayDate(Timestamp payDate) {
		this.payDate = payDate;
	}
	public Timestamp getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Timestamp deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Timestamp getConfirmDate() {
		return confirmDate;
	}
	public void setConfirmDate(Timestamp confirmDate) {
		this.confirmDate = confirmDate;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Order() {
		super();
	}
	public Order(int id, String orderCode, String address, String post, String receiver, String mobile,
			String userMessage, Timestamp payDate, Timestamp deliveryDate, Timestamp confirmDate, int uid,
			String status) {
		super();
		this.id = id;
		this.orderCode = orderCode;
		this.address = address;
		this.post = post;
		this.receiver = receiver;
		this.mobile = mobile;
		this.userMessage = userMessage;
		this.payDate = payDate;
		this.deliveryDate = deliveryDate;
		this.confirmDate = confirmDate;
		this.uid = uid;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderCode=" + orderCode + ", address=" + address + ", post=" + post
				+ ", receiver=" + receiver + ", mobile=" + mobile + ", userMessage=" + userMessage + ", payDate="
				+ payDate + ", deliveryDate=" + deliveryDate + ", confirmDate=" + confirmDate + ", uid=" + uid
				+ ", status=" + status + "]";
	}
	
	

}
