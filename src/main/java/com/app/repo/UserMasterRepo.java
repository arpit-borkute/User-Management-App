package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.UserMaster;

public interface UserMasterRepo extends JpaRepository<UserMaster, Integer> {

	// public UserMaster findByEmailAndPassword(String email,String pwd); ---2nd way

	public UserMaster findByEmail(String email);
}
