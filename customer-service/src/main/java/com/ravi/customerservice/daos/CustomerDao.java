package com.ravi.customerservice.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.customerservice.entities.*;

public interface CustomerDao extends JpaRepository<Customer, Integer>{
	
	void deleteByEmail(String email);

	Customer findByEmail(String email);

}
