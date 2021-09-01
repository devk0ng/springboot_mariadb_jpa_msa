package net.devkong.api.user.controller;

import net.devkong.api.user.domain.User;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @GetMapping
    public List<User> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<User> getById(Long id) {
        return Optional.empty();
    }

    @PutMapping
    public void update(User user) {

    }

    @PostMapping
    public void save(User user) {

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
