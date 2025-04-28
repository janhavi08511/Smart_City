package com.example.smart_city.controller;

import com.example.smart_city.model.Restaurant;
import com.example.smart_city.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    private final RestaurantService service;

    public RestaurantController(RestaurantService service) {
        this.service = service;
    }

    @GetMapping
    public List<Restaurant> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Restaurant create(@RequestBody Restaurant restaurant) {
        return service.save(restaurant);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
