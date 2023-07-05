package com.office.Restaurant.repository;

import com.office.Restaurant.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {

        Optional<Restaurant> findById(Long restId);
}
