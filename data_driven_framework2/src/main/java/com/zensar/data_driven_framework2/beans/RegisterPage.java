package com.zensar.data_driven_framework2.beans;

public class RegisterPage {
private String name;
private String email;
private String phone;
private String gender;
private  String password;
private String country;
private String weeklyEmail;
private String monthlyEmail;
private String occassionalEmail;

public RegisterPage() {
	// TODO Auto-generated constructor stub
}

public RegisterPage(String name, String email, String phone, String gender, String password, String country,
		String weeklyEmail, String monthlyEmail, String occassionalEmail) {
	super();
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.gender = gender;
	this.password = password;
	this.country = country;
	this.weeklyEmail = weeklyEmail;
	this.monthlyEmail = monthlyEmail;
	this.occassionalEmail = occassionalEmail;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
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

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getWeeklyEmail() {
	return weeklyEmail;
}

public void setWeeklyEmail(String weeklyEmail) {
	this.weeklyEmail = weeklyEmail;
}

public String getMonthlyEmail() {
	return monthlyEmail;
}

public void setMonthlyEmail(String monthlyEmail) {
	this.monthlyEmail = monthlyEmail;
}

public String getOccassionalEmail() {
	return occassionalEmail;
}

public void setOccassionalEmail(String occassionalEmail) {
	this.occassionalEmail = occassionalEmail;
}

@Override
public String toString() {
	return "RegisterPage [name=" + name + ", email=" + email + ", phone=" + phone + ", gender=" + gender + ", password="
			+ password + ", country=" + country + ", weeklyEmail=" + weeklyEmail + ", monthlyEmail=" + monthlyEmail
			+ ", occassionalEmail=" + occassionalEmail + "]";
}

}
