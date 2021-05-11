package fr.project.store.repositories;

import fr.project.store.entites.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")
public interface ProductRepo extends JpaRepository<Product,Integer> {

    Page<Product> findProductByCategory_Id(@RequestParam("id") int id, Pageable pageable);
      Page<Product>  findProductsByNameContaining(@RequestParam("name") String name, Pageable pageable);
      Page<Product>  findProductById(@RequestParam("id") int id,Pageable pageable);

}
