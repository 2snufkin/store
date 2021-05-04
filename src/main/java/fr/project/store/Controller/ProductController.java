package fr.project.store.Controller;
import fr.project.store.DTO.ProductDTO;
import fr.project.store.entites.Product;
import fr.project.store.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class ProductController {

    @Autowired
    private ProductService productServ;

    @PostMapping(path = "/useradd")
    public void details(@RequestBody ProductDTO json){
        Product product = new Product();
        product.setName(json.getName());
        product.setImage(json.getImageUrl());
        product.setActive(true);
         product.setDateCreated(json.getDateCreated());
        product.setSku(json.getAsin());
         System.out.println(json.getAsin());
         product.setDescription(json.getDescription());
        product.setStockUnites(json.getStockUnites());
         productServ.addProduct(product);
    }




}
