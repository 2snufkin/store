package fr.project.store.repositories;

import fr.project.store.entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
 public interface ProductCategory extends JpaRepository<Category,Integer> {

}
