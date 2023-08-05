package com.ranjan.bo;

public class CustomerBO {
	
	private Integer cno;
	private String cname;
	private String cadd;
	private Integer roomno;
	private Double billamt;
	
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
	public Double getBillamt() {
		return billamt;
	}
	public void setBillamt(Double billamt) {
		this.billamt = billamt;
	}
	
	
}
