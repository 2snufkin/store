package fr.project.store.Repositories;


import fr.project.store.Entites.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Integer> {
}
