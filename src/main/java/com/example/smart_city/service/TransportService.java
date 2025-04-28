package com.example.smart_city.service;

import com.example.smart_city.model.Transport;
import com.example.smart_city.repository.TransportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportService {
    private final TransportRepository repo;

    public TransportService(TransportRepository repo) {
        this.repo = repo;
    }

    public List<Transport> getAll() {
        return repo.findAll();
    }

    public Transport save(Transport ts) {
        return repo.save(ts);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
