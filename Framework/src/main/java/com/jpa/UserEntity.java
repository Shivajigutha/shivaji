package com.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UserEntity {
	public String fullname, phone, gender, qualification, email, password;
	@Id
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int age;
	public float gpa, experience;
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
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
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}

	public UserEntity(String email) {
		this.email=email;
	}
	public UserEntity(String email, String password) {
		this.email=email;
		this.password=password;
	}
	
	public UserEntity(String fullname, String phone, String gender, int age, String qualification, float gpa, float experience, String email, String password ) {
		this.fullname=fullname;
		this.phone=phone;
		this.gender=gender;
		this.age=age;
		this.qualification=qualification;
		this.gpa=gpa;
		this.experience=experience;
		this.email=email;
		this.password=password;
	}
		
	public UserEntity() {
		// TODO Auto-generated constructor stub
	}


}
