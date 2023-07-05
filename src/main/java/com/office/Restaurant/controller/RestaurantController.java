package com.office.Restaurant.controller;

import com.office.Restaurant.entity.Restaurant;
import com.office.Restaurant.service.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restaurants")
@AllArgsConstructor
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping
    public Restaurant create(@RequestBody Restaurant restaurant)
    {
        return restaurantService.create(restaurant);
    }

//    @GetMapping
//    public List<Restaurant> getAllByIds(@RequestParam List<Long> restaurantIds)
//    {
//        return restaurantService.getAllByIds(restaurantIds);
  //  }

    @GetMapping
    public List<Restaurant>  getAll() {
        return restaurantService.getAll();
    }

    @GetMapping("/{restId}")
    public Optional<Restaurant> getById(@PathVariable Long restId) {
        return restaurantService.getById(restId);
    }

    @GetMapping("/name")
    public Object getRestaurantNameById(@RequestHeader("restId") Long restId) {
        return restaurantService.getRestaurantNameById(restId);
    }
}
