package net.devkong.api.item.controller;

import lombok.RequiredArgsConstructor;
import net.devkong.api.item.domain.Item;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowCredentials = "false")
@RequiredArgsConstructor
@RestController
@RequestMapping("/items")
public class ItemController {
    @GetMapping
    public List<Item> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<Item> getById(Long id) {
        return Optional.empty();
    }

    @PutMapping
    public void update(Item item) {

    }

    @PostMapping
    public void save(Item item) {

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
