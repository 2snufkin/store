package fr.project.store.Repositories;

import fr.project.store.Entites.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLineRepo extends JpaRepository<OrderLine, Integer> {
}
