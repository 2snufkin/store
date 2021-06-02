package fr.project.store.repositories;

import fr.project.store.entites.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLineRepo extends JpaRepository<OrderLine, Integer> {

}
