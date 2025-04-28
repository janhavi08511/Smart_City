package com.example.smart_city.controller;

import com.example.smart_city.model.Hotel;
import com.example.smart_city.service.HotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    private final HotelService service;

    public HotelController(HotelService service) {
        this.service = service;
    }

    @GetMapping
    public List<Hotel> getAll() {
        return service.getAll();
    }

    @GetMapping("/city/{city}")
    public List<Hotel> getByCity(@PathVariable String city) {
        return service.getByCity(city);
    }

    @PostMapping
    public Hotel create(@RequestBody Hotel hotel) {
        return service.save(hotel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}


