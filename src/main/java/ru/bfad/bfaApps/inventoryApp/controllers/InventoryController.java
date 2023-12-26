package ru.bfad.bfaApps.inventoryApp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.bfad.bfaApps.inventoryApp.models.Employee;
import ru.bfad.bfaApps.inventoryApp.models.Inventory;
import ru.bfad.bfaApps.inventoryApp.services.InventoryService;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/inventory")
@RequiredArgsConstructor
@CrossOrigin
public class InventoryController {
    private final InventoryService inventoryService;

    @GetMapping
    public List<Inventory> getInventories(){
        return inventoryService.getInventories();
    }

    @GetMapping("/{id}")
    public Inventory getInventory(@PathVariable Integer id){
        return inventoryService.getInventory(id).orElseThrow();
    }

    @GetMapping("/owner/{id}")
    public Set<Employee> getEmployee(@PathVariable Integer id){
        return inventoryService.getInventory(id).orElseThrow().getEmployees();
    }
}
