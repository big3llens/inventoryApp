package ru.bfad.bfaApps.inventoryApp.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.bfad.bfaApps.inventoryApp.models.Consumable;
import ru.bfad.bfaApps.inventoryApp.repositories.ConsumableRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConsumableService {
    private final ConsumableRepository consumableRepository;

    public List<Consumable> getConsumables(){
        return consumableRepository.findAll();
    }

    public Consumable addConsumable(Consumable consumable){
        return consumableRepository.save(consumable);
    }
}
