package fr.project.store.services;

import fr.project.store.entites.Product;
import fr.project.store.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService   {

     ProductRepo productRepo;
    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    public void addProduct(Product product) {
        productRepo.save(product);

    }
}
