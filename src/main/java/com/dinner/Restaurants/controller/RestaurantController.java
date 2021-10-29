package com.dinner.Restaurants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dinner.Restaurants.Models.*;
import com.dinner.Restaurants.Repository.RestaurantRepository;

import java.util.List;

@RestController
public class RestaurantController{

    @Autowired
    RestaurantRepository restaurantRepository;

    @GetMapping("/")
    public List<Restaurant> getRestaurants(@RequestParam(required = false) String[] excludedCuisines){
        if(excludedCuisines == null)
            return (List<Restaurant>) restaurantRepository.findAll();
        else
            return restaurantRepository.findByCuisineNotIn(excludedCuisines);
    }

    @PostMapping("/addRestaurant")
    public void addRestaurant(@RequestBody Restaurant restaurant){
        System.out.println(restaurant.getCuisine());
        restaurantRepository.save(restaurant);
    }
}
