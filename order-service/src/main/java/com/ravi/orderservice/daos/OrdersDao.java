package com.ravi.orderservice.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.orderservice.entities.Orders;


public interface OrdersDao extends JpaRepository<Orders, Integer> {

	Orders findByOrderid(int orderid);
	
	Orders[] findByDeliveryid(int deliveryid);

	Orders[] findByCustname(String custname);
	
	Orders[] findByRestaurantname(String restaurantname);

}
