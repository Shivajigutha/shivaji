package com.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, String>{
	public List<CompanyEntity> findByUsernameAndPwd(String username, String pwd);

}
