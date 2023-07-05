package com.office.Restaurant.service;

import com.office.Restaurant.entity.Restaurant;
import com.office.Restaurant.repository.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RestaurantServiceImpl implements RestaurantService{

    @Autowired
    private RestaurantRepository restaurantRepository;
    @Override
    public Restaurant create(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

//    @Override
//    public List<Restaurant> getAllByIds(List<Long> restaurantIds) {
//        return restaurantRepository.findAllById(restaurantIds);
//    }

    @Override
    public Optional<Restaurant> getById(@PathVariable Long restId) {
        return restaurantRepository.findById(restId);
    }

    @Override
    public List<Restaurant> getAll() {
        return restaurantRepository.findAll();
    }

    @Override
    public Object getRestaurantNameById(Long restId) {
        return getById(restId).map(Restaurant::getName).orElse(null);
    }
}
