package com.devansh.Restaurant.controller;

import com.devansh.Restaurant.model.Restaurant;
import com.devansh.Restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestaurantController {


    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/bookrestros")
    public String bookrestro(@RequestBody() List<Restaurant> restros){
        return restaurantService.bookRestro(restros);
    }

    @GetMapping("/getrestros")
    public List<Restaurant> bookrestro(){
        return restaurantService.getRestros();
    }

    @GetMapping("/getrestro")
    public Optional<Restaurant> bookrestro(@RequestParam("restroId") Integer restroId){
        return restaurantService.getRestro(restroId);
    }

    @PutMapping("/updaterestro")
    public String bookrestro(@RequestBody Restaurant restro){
        return restaurantService.updateRestro(restro);
    }

    @DeleteMapping("/deleterestro")
    public String deleterestro(@RequestParam("id")Integer id){
        return restaurantService.deleteRestro(id);
    }

}
