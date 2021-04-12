package com.cg.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonEntity {

	@Id
	int adhar_No;
	String full_name;
	int age;
	double salary;
	String disease;
	String gender;
	String DOB;
	int mobile_no;
	String address;
	String email_id;
	String nationality;
	String state;
	int pincode;
	int agent_ref_no;

	public PersonEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
	public PersonEntity(int adhar_No, String full_name, int age, double salary, String disease, String gender, String dOB,
			int mobile_no, String address, String email_id, String nationality, String state, int pincode,
			int agent_ref_no) {
		super();
		this.adhar_No = adhar_No;
		this.full_name = full_name;
		this.age = age;
		this.salary = salary;
		this.disease = disease;
		this.gender = gender;
		DOB = dOB;
		this.mobile_no = mobile_no;
		this.address = address;
		this.email_id = email_id;
		this.nationality = nationality;
		this.state = state;
		this.pincode = pincode;
		this.agent_ref_no = agent_ref_no;
	}

	
	@Override
	public String toString() {
		return "PersonEntity [adhar_No=" + adhar_No + ", full_name=" + full_name + ", age=" + age + ", salary=" + salary
				+ ", disease=" + disease + ", gender=" + gender + ", DOB=" + DOB + ", mobile_no=" + mobile_no
				+ ", address=" + address + ", email_id=" + email_id + ", nationality=" + nationality + ", state="
				+ state + ", pincode=" + pincode + ", agent_ref_no=" + agent_ref_no + "]";
	}

	
	public int getAdhar_No() {
		return adhar_No;
	}
	public void setAdhar_No(int adhar_No) {
		this.adhar_No = adhar_No;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public int getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getAgent_ref_no() {
		return agent_ref_no;
	}
	public void setAgent_ref_no(int agent_ref_no) {
		this.agent_ref_no = agent_ref_no;
	}
	
	
	
	
	
}
