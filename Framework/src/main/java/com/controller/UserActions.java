package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.bussiness.UserBean;
import com.jpa.UserEntity;

public class UserActions implements ServletRequestAware{
	private static final long serialVersionUID = 1L;
	//HTML source form beans
	public String fullname, phone, gender, qualification, email, password;
	public String username, pwd;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
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
	private List<UserEntity> profileInformation;

	@Autowired
	UserBean userBean;
	private HttpServletRequest request;
	
	
	
	public List<UserEntity> getProfileInformation() {
		return profileInformation;
	}
	public void setProfileInformation(List<UserEntity> profileInformation) {
		this.profileInformation = profileInformation;
	}
	public String login() {

			System.out.println("before authorization "+ email+ " and " +password);
			String beanResult = userBean.authorize(email,password);
			if(beanResult.equals("success")) {
				request.getSession().setAttribute("loggedIn", true);
				request.getSession().setAttribute("userId", email);


			}
			return beanResult;
		
		}
	

	public String logout() {
		
				request.getSession().invalidate();
			return "success";
		
		}
	
	public String profileInfo() {
		String profileSession = (String) request.getSession().getAttribute("userId");
		profileInformation = userBean.getProfileInfo(profileSession);
		UserEntity data = null;
		if(!(profileInformation.get(0).getEmail()).isEmpty()) {
			data = new UserEntity();
			data.setEmail(profileInformation.get(0).getEmail());
			data.setAge(profileInformation.get(0).getAge());
			data.setExperience(profileInformation.get(0).getExperience());
			data.setFullname(profileInformation.get(0).getFullname());
			data.setGender(profileInformation.get(0).getGender());
			data.setGpa(profileInformation.get(0).getGpa());
			data.setPhone(profileInformation.get(0).getPhone());
			data.setQualification(profileInformation.get(0).getQualification());
		}
		//System.out.println(profileInformation.get(0).getEmail());
		return "success";
	}
	
	public String companyLogin() {
		System.out.println("before authorization "+ username+ " and " +pwd);
		String beanResult = userBean.authorizeCompany(username,pwd);
		return beanResult;
		
			
		
	}
	
	
	
	public String register() {
		//System.out.println("before registration "+ email+ " and " +password);
		String beanResult = userBean.registration(fullname, phone, gender,  age,  qualification,  gpa,  experience,  email,  password);
		return beanResult;
	}
	public String reset() {
		String beanResult = userBean.resetPassword(email);
		return beanResult;
	}
	public String updatePassword() {
		String beanResult = userBean.updatePassword(email,password);
		return beanResult;
	}
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}
	
}
