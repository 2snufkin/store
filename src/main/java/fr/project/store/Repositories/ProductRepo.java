package fr.project.store.Repositories;

import fr.project.store.Entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "product", path = "product")
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
