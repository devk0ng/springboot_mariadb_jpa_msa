package net.devkong.api.item.service;

import net.devkong.api.item.domain.Item;
import net.devkong.api.user.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ItemService {
    List<Item> findAll();
    Optional<Item> findById(Long id);
    void save(Item item);
    boolean existsById(Long id);
    Long count();
    void deleteById(Long id);
}
