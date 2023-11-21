package ru.bfad.bfaApps.inventoryApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bfad.bfaApps.inventoryApp.models.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

}
