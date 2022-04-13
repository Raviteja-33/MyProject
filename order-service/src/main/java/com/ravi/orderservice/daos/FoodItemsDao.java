package com.ravi.orderservice.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.orderservice.entities.FoodItems;

public interface FoodItemsDao extends JpaRepository<FoodItems, Integer>{
	
	//FoodItems[] findByRestaurantname(String restaurantname);

}
