package ru.bfad.bfaApps.inventoryApp.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.bfad.bfaApps.inventoryApp.models.Employee;
import ru.bfad.bfaApps.inventoryApp.repositories.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<Employee> getEmployees(){
        return userRepository.findAll();
    }

    public Employee getEmployee(Integer id){
        return userRepository.findEmployeeByEmployeeId(id).orElseThrow(() -> new RuntimeException("Ошибка"));
//        return userRepository.findUsers().orElseThrow(() -> new RuntimeException("Ошибка"));
    }
}
