package com.hrd.member.domain;

import java.io.Serializable;

public class MemberDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private int custno;
	private String custname;
	private String phone;
	private String address;
	private String joindate;
	private String grade;
	private String city;

	public MemberDTO(int custno, String custname, String phone, String address, String joindate, String grade,
			String city) {
		this.custno = custno;
		this.custname = custname;
		this.phone = phone;
		this.address = address;
		this.joindate = joindate;
		this.grade = grade;
		this.city = city;
	}
	
	public MemberDTO(int custno) {
		this.custno = custno;
	}
	
	
	public int getCustno() {
		return custno;
	}

	public void setCustno(int custno) {
		this.custno = custno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getColumns() {
		StringBuffer sql = new StringBuffer();
		sql.append("   CUSTNO   ");
		sql.append("   CUSTNAME ");
		sql.append("   PHONE    ");
		sql.append("   ADDRESS  ");
		sql.append("   JOINDATE ");
		sql.append("   GRADE    ");
		sql.append("   CITY     ");
		return sql.toString();
	}

	@Override
	public String toString() {
		return "MemberDTO [custno=" + custno + ", custname=" + custname + ", phone=" + phone + ", address=" + address
				+ ", joindate=" + joindate + ", grade=" + grade + ", city=" + city + "]";
	}
	
}
