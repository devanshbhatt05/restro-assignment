package com.devansh.Restaurant.service;

import com.devansh.Restaurant.model.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {

    String bookRestro(List<Restaurant> restros);

    List<Restaurant> getRestros();

    Optional<Restaurant> getRestro(Integer restroId);

    String updateRestro(Restaurant restro);

    String deleteRestro(Integer id);
}

