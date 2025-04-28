package com.example.smart_city.controller;

import com.example.smart_city.model.TouristSpot;
import com.example.smart_city.service.TouristSpotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/touristspots")
public class TouristSpotController {

    private final TouristSpotService service;

    public TouristSpotController(TouristSpotService service) {
        this.service = service;
    }

    @GetMapping
    public List<TouristSpot> getAll() {
        return service.getAll();
    }

    @PostMapping
    public TouristSpot create(@RequestBody TouristSpot spot) {
        return service.save(spot);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
