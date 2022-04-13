package com.ravi.orderservice.services;

import com.ravi.orderservice.entities.FoodItems;

public interface FoodItemsService {
	
	FoodItems save(FoodItems fooditem);
	
	//FoodItems[] findByRestaurantname(String restaurantname);

}
