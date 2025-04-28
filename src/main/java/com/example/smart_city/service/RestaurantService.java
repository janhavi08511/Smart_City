package com.example.smart_city.service;

import com.example.smart_city.model.Restaurant;
import com.example.smart_city.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    private final RestaurantRepository repo;

    public RestaurantService(RestaurantRepository repo) {
        this.repo = repo;
    }

    public List<Restaurant> getAll() {
        return repo.findAll();
    }

    public Restaurant save(Restaurant restaurant) {
        return repo.save(restaurant);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
