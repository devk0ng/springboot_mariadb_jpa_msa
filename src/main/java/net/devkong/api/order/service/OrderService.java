package net.devkong.api.order.service;

import net.devkong.api.item.domain.Item;
import net.devkong.api.order.domain.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface OrderService {
    List<Order> findAll();
    Optional<Order> getById(Long id);
    void save(Order order);
    boolean existsById(Long id);
    Long count();
    void deleteById(Long id);
}
