package net.devkong.api.order.controller;

import net.devkong.api.order.domain.Order;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {
    @GetMapping
    public List<Order> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<Order> getById(Long id) {
        return Optional.empty();
    }

    @PutMapping
    public void update(Order order) {

    }

    @PostMapping
    public void save(Order order) {

    }

    @GetMapping("/exists/{id}")
    public boolean existsById(Long id) {
        return false;
    }

    @GetMapping("/count")
    public Long count() {
        return null;
    }

    @DeleteMapping
    public void deleteById(Long id) {

    }
}
