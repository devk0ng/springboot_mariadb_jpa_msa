package net.devkong.api.item.service;

import lombok.RequiredArgsConstructor;
import net.devkong.api.item.domain.Item;
import net.devkong.api.item.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ItemServiceImpl implements ItemService{
    private final ItemRepository itemRepository;

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Optional<Item> findById(Long id) {
        return itemRepository.findById(id);
    }

    @Override
    public void save(Item item) {
        itemRepository.save(item);
    }

    @Override
    public boolean existsById(Long id) {
        return itemRepository.existsById(id);
    }

    @Override
    public Long count() {
        return itemRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        itemRepository.deleteById(id);
    }
}
