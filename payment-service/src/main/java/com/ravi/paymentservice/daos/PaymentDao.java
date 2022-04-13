package com.ravi.paymentservice.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.paymentservice.entities.Payment;

public interface PaymentDao extends JpaRepository<Payment, Integer>{
	
	Payment findByPaymentid(int id);
	
	Payment findByOrderid(int id);

}
