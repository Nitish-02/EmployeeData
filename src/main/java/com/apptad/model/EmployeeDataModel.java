package com.apptad.model;

public class EmployeeDataModel {
	
	private String empid;
	private String fname;
	private String lname;
	private String emailid;
	private String address;
	private String contact;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "EmployeeDataModel [empid=" + empid + ", fname=" + fname + ", lname=" + lname + ", emailid=" + emailid
				+ ", address=" + address + ", contact=" + contact + "]";
	}
	
	
	

}
