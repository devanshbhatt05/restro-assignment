package com.devansh.Restaurant.dao;

import com.devansh.Restaurant.model.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantDao extends CrudRepository<Restaurant,Integer> {
}
