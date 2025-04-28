package com.example.smart_city.service;

import com.example.smart_city.model.TouristSpot;
import com.example.smart_city.repository.TouristSpotRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristSpotService {
    private final TouristSpotRepository repo;

    public TouristSpotService(TouristSpotRepository repo) {
        this.repo = repo;
    }

    public List<TouristSpot> getAll() {
        return repo.findAll();
    }

    public TouristSpot save(TouristSpot spot) {
        return repo.save(spot);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
