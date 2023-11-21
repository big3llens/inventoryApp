package ru.bfad.bfaApps.inventoryApp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "public", name = "consumables")
@Data
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "consumableId")
public class Consumable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "consumable_id")
    private Integer consumableId;

    @Column(name = "consumable_name")
    private String consumableName;

    @ManyToMany(mappedBy = "consumables")
    private List<Inventory> inventories;
}
