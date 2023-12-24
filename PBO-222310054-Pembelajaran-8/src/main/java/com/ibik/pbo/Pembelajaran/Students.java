package com.ibik.pbo.Pembelajaran;

public class Students {
	private Integer id;
	private String npm;
	private String fullname;
	private String email;
	private String phone;
	private String gender;
	private String citizenship;
	
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getCitizenship() {
		return citizenship;
	}
	
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
//	
//	public String getNpm() {
//		return npm;
//	}
//	public void setNpm(String npm) {
//		this.npm= npm;
//	}
}