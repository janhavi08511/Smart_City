package com.example.smart_city.service;

import com.example.smart_city.model.Hotel;
import com.example.smart_city.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    private final HotelRepository repository;

    public HotelService(HotelRepository repository) {
        this.repository = repository;
    }

    public List<Hotel> getAll() {
        return repository.findAll();
    }

    public Hotel save(Hotel hotel) {
        return repository.save(hotel);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Hotel> getByCity(String city) {
        return repository.findByCityIgnoreCase(city);
    }
}
