package ru.bfad.bfaApps.inventoryApp.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.bfad.bfaApps.inventoryApp.repositories.ConsumableRepository;

@Service
@RequiredArgsConstructor
public class ConsumableService {
    private final ConsumableRepository consumableRepository;
}
