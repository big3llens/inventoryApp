package ru.bfad.bfaApps.inventoryApp.repositories.specifications;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.MultiValueMap;
import ru.bfad.bfaApps.inventoryApp.models.Employee;

public class EmployeeSpecifications {
    public static Specification<Employee> nameLike (String name){
        return (Specification<Employee>)(root, query, criteriaBuilder) -> (criteriaBuilder.like(root.get("employeeName"), String.format("%%%s%%", name)));
    }

    public static Specification<Employee> departmentLike (String department){
        return (Specification<Employee>)(root, query, criteriaBuilder) -> (criteriaBuilder.like(root.get("department"), String.format("%%%s%%", department)));
    }
    
    public static Specification<Employee> build (MultiValueMap<String, String> params){
        Specification<Employee> spec = Specification.where(null);

        if(params.containsKey("name") && !params.getFirst("name").isBlank()){
            spec = spec.and(EmployeeSpecifications.nameLike(params.getFirst("name")));
            System.out.println("зашел1! " + params.getFirst("name"));
        }
        if(params.containsKey("department") && !params.getFirst("department").isBlank()){
            spec = spec.and(departmentLike(params.getFirst("department")));
        }
        return spec;
    }
}
