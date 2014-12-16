package com.okdevtv.jmeter.domain;

public class HomeVo {
	private String address;
	private int streetNo;
	public HomeVo() {}
	public HomeVo(String address, int streetNo) {
		super();
		this.address = address;
		this.streetNo = streetNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	@Override
	public String toString() {
		return "HomeVo [address=" + address + ", streetNo=" + streetNo + "]";
	}

}
