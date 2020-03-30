package com.bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.CompanyEntity;
import com.jpa.CompanyRepository;
import com.jpa.UserEntity;
import com.jpa.UserRepository;

@Service
public class UserBean {
	@Autowired
	UserRepository userRepository;
	@Autowired
	CompanyRepository companyRepository;
	
	public String authorize(String email, String password) {
		List<UserEntity> userEntity = userRepository.findByEmailAndPassword(email, password);
		try {
			if(userEntity.size()>0) {
				System.out.println(email+ " " + password);
				return "success";
			}
			else
				return "error";
				
		
	} catch (Exception e) {
		e.printStackTrace();
		return "badrequest400";
	}
		
	}
	public List<UserEntity> getProfileInfo(String profileSession) {
		return userRepository.getProfileInfo(profileSession);
	}
	
	public String authorizeCompany(String username, String pwd) {
		List<CompanyEntity> companyEntity = companyRepository.findByUsernameAndPwd(username, pwd);
		try {
			if(companyEntity.size()>0) {
				System.out.println(username+ " " + pwd);
				return "successcompany";
			}
			else
				return "errorcompany";
				
		
	} catch (Exception e) {
		e.printStackTrace();
		return "badrequest400";
	}
		
	}
	public String registration(String fullname, String phone, String gender, int age, String qualification, float gpa, float experience, String email, String password) {
		try {
			List<UserEntity> userEntity = userRepository.findByEmail(email);
			if (userEntity.size() == 0) {
				UserEntity user = new UserEntity(fullname, phone, gender,  age,  qualification,  gpa,  experience,  email,  password);
				userRepository.save(user);
				return "success";
			}else {
				return "error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "badrequest400";
		}
	}
	public String resetPassword(String email) {
		List<UserEntity> userEntity = userRepository.findByEmail(email);
		try {
			if(userEntity.size()>0) {
				System.out.println(email);
				return "success";
			}
			else
				return "error";
				
		
	} catch (Exception e) {
		e.printStackTrace();
		return "badrequest400";
	}
		
	}
	public String updatePassword(String email, String password) {
		List<UserEntity> userEntity = userRepository.findByEmail(email);
		try {
			if(userEntity.size()>0) {
				System.out.println(email);
				userEntity.get(0).setPassword(password);
				return "success";
			}
			else
				return "error";
				
		
	} catch (Exception e) {
		e.printStackTrace();
		return "badrequest400";
	}
		
	}

}
