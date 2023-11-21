package ru.bfad.bfaApps.inventoryApp.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(schema = "public", name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "location")
    private String location;

    @Column(name = "department")
    private String department;

//    @JsonManagedReference
    @ManyToMany
    @JoinTable(
            name = "employee_inventory",
            joinColumns = { @JoinColumn(name = "employee_id")},
            inverseJoinColumns = {@JoinColumn(name = "inventory_code")})
    private List<Inventory> inventories;
}
