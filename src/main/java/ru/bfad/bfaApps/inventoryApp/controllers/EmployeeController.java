package ru.bfad.bfaApps.inventoryApp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import ru.bfad.bfaApps.inventoryApp.models.Inventory;
import ru.bfad.bfaApps.inventoryApp.models.Employee;
import ru.bfad.bfaApps.inventoryApp.repositories.specifications.EmployeeSpecifications;
import ru.bfad.bfaApps.inventoryApp.services.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
@CrossOrigin
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    private List<Employee> getEmployees(@RequestParam (required = false)MultiValueMap<String, String> params){
        System.out.println(params.toString());
        return employeeService.getEmployees(EmployeeSpecifications.build(params));
    }

    @GetMapping("/{id}")
    private Employee getEmployee(@PathVariable("id") Integer id){
        return employeeService.getEmployee(id);
    }

    @GetMapping("/inventoriesOfUser/{id}")
    private List<Inventory> getInventories(@PathVariable Integer id){
        return employeeService.getEmployee(id).getInventories();
    }
}
