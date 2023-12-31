package ru.bfad.bfaApps.inventoryApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.bfad.bfaApps.inventoryApp.models.Employee;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaSpecificationExecutor<Employee>, JpaRepository<Employee, Integer> {
//    Optional<List<User>> findAllBy;
    Optional<Employee> findEmployeeByEmployeeId(Integer id);
}
