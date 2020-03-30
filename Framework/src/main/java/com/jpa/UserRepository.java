package com.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{
	public List<UserEntity> findByEmailAndPassword(String email, String password);
	public List<UserEntity> findByEmail(String email);
	
	@Query("select u from UserEntity u where u.email=?1")
	public List<UserEntity> getProfileInfo(String profileSession);

}
