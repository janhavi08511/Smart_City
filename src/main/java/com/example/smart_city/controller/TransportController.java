package com.example.smart_city.controller;

import com.example.smart_city.model.Transport;
import com.example.smart_city.service.TransportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transport")
public class TransportController {

    private final TransportService service;

    public TransportController(TransportService service) {
        this.service = service;
    }

    @GetMapping
    public List<Transport> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Transport create(@RequestBody Transport transport) {
        return service.save(transport);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
