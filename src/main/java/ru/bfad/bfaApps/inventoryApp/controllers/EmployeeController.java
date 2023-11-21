package ru.bfad.bfaApps.inventoryApp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.bfad.bfaApps.inventoryApp.models.Inventory;
import ru.bfad.bfaApps.inventoryApp.models.Employee;
import ru.bfad.bfaApps.inventoryApp.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {
    private final UserService userService;

    @GetMapping
    private List<Employee> getEmployees(){
        List<Employee> list = userService.getEmployees();
        return list;
    }

    @GetMapping("/{id}")
    private Employee getEmployee(@PathVariable("id") Integer id){
        return userService.getEmployee(id);
    }

    @GetMapping("/inventoriesOfUser/{id}")
    private List<Inventory> getInventories(@PathVariable Integer id){
        return userService.getEmployee(id).getInventories();
    }
}
