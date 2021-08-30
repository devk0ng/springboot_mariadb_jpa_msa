package net.devkong.api.item.service;

import net.devkong.api.item.domain.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService{
    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public Optional<Item> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Item item) {

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
