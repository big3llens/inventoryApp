package ru.bfad.bfaApps.inventoryApp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bfad.bfaApps.inventoryApp.services.ConsumableService;

@RestController
@RequestMapping("/consumble")
@RequiredArgsConstructor
public class ConsumableController {
    private final ConsumableService consumableService;
}
