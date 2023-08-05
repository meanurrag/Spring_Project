package com.ranjan.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {

	private Integer cno;
	private String cname;
	private String cadd;
	private Integer roomno;
	private Double perday;
	private Integer daystay;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public Integer getRoomno() {
		return roomno;
	}
	public void setRoomno(Integer roomno) {
		this.roomno = roomno;
	}
	public Double getPerday() {
		return perday;
	}
	public void setPerday(Double perday) {
		this.perday = perday;
	}
	public Integer getDaystay() {
		return daystay;
	}
	public void setDaystay(Integer daystay) {
		this.daystay = daystay;
	}
	
	
	
}
