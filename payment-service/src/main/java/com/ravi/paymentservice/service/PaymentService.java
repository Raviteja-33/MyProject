package com.ravi.paymentservice.service;

import com.ravi.paymentservice.entities.Payment;

public interface PaymentService {
	
	Payment save(Payment payment);
	
	Payment findByOrderid(int id);

}
