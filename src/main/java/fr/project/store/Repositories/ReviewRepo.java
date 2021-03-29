package fr.project.store.Repositories;

import fr.project.store.Entites.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Integer> {
}
