package com.office.Restaurant.service;

import com.office.Restaurant.entity.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {
    Restaurant create(Restaurant restaurant);

   // List<Restaurant> getAllByIds(List<Long> restaurantIds);

    Optional<Restaurant> getById(Long restId);

   List<Restaurant> getAll();

    Object getRestaurantNameById(Long restId);
}
