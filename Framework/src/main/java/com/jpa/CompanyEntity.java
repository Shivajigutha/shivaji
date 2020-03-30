package com.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="companies")
public class CompanyEntity {

	public String username, pwd;
	@Id
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
	public CompanyEntity(String username, String pwd) {
		this.username=username;
		this.pwd=pwd;
	}
	public CompanyEntity() {
		// TODO Auto-generated constructor stub
	}
	
}
