package ru.bfad.bfaApps.inventoryApp.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import ru.bfad.bfaApps.inventoryApp.models.Employee;
import ru.bfad.bfaApps.inventoryApp.repositories.EmployeeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> getEmployees(Specification<Employee> spec){
        List<Employee> list = employeeRepository.findAll(spec);
        System.out.println("Печатаем лист " + list);
        return list;
    }

    public Employee getEmployee(Integer id){
//        return employeeRepository.findById(id)
        return employeeRepository.findEmployeeByEmployeeId(id).orElseThrow(() -> new RuntimeException("Ошибка"));
//        return userRepository.findUsers().orElseThrow(() -> new RuntimeException("Ошибка"));
    }
}
