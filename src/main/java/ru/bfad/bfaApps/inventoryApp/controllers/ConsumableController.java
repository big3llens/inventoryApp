package ru.bfad.bfaApps.inventoryApp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.bfad.bfaApps.inventoryApp.models.Consumable;
import ru.bfad.bfaApps.inventoryApp.services.ConsumableService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/consumable")
@RequiredArgsConstructor
@CrossOrigin
public class ConsumableController {
    private final ConsumableService consumableService;

    @GetMapping
    public List<Consumable> getConsumables(){
        return consumableService.getConsumables();
    }

//    @PostMapping("/add")
//    public Consumable addConsumables(@RequestBody Consumable consumable){
//        return consumableService.addConsumable(consumable);
//    }

    @PostMapping("/add")
    public Consumable addConsumables(@RequestParam Map<String, String> body){
        return consumableService.addConsumable(new Consumable(body.get("name")));
    }


}
