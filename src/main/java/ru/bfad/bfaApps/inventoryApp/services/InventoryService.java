package ru.bfad.bfaApps.inventoryApp.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.bfad.bfaApps.inventoryApp.models.Inventory;
import ru.bfad.bfaApps.inventoryApp.repositories.InventoryRepository;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public List<Inventory> getInventories(){
        return inventoryRepository.findAll();
    }

    public Optional<Inventory> getInventory(Integer id){
        return inventoryRepository.findById(id);
    }
}
