package ru.bfad.bfaApps.inventoryApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bfad.bfaApps.inventoryApp.models.Consumable;

@Repository
public interface ConsumableRepository extends JpaRepository<Consumable, Integer> {

}
