package com.dinner.Restaurants.Repository;
import com.dinner.Restaurants.Models.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface RestaurantRepository extends CrudRepository<Restaurant, String>{

    List<Restaurant> findByCuisineNotIn(String[] exludedCuisines);
}
