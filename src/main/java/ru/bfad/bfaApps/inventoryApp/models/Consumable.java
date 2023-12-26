package ru.bfad.bfaApps.inventoryApp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "consumables")
@Data
@NoArgsConstructor
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

    @ManyToMany(mappedBy = "consumables", fetch = FetchType.LAZY)
    private List<Inventory> inventories;

    public Consumable(String consumableName) {
        this.consumableName = consumableName;
    }
}
