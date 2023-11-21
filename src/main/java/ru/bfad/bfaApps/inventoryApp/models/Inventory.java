package ru.bfad.bfaApps.inventoryApp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(schema = "public", name = "inventory")
@Data
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "inventoryCode")
public class Inventory {

    @Id
    @Column(name = "inventory_code")
    private Integer inventoryCode;

    @Column(name = "inventory_name")
    private String inventoryName;

    @Column(name = "inventory_model")
    private String inventoryModel;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "has_consumables")
    private boolean hasConsumables;

//    @JsonBackReference
    @JsonIgnore
    @ManyToMany(mappedBy = "inventories", fetch = FetchType.LAZY)
    private Set<Employee> employees;

    @ManyToMany
    @JoinTable(
            name = "inventory_consumable",
            joinColumns = {@JoinColumn(name = "inventory_code")},
            inverseJoinColumns = {@JoinColumn(name = "consumable_id")}
    )
    private List<Consumable> consumables;

    @Override
    public String toString() {
        return "Inventory{" +
                "inventoryCode=" + inventoryCode +
                ", invenoryName='" + inventoryName + '\'' +
                ", invenoryModel='" + inventoryModel + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                "}";
    }
}
