package net.devkong.api.order.service;

import net.devkong.api.order.domain.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public Optional<Order> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Order order) {

    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
