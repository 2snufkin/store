package fr.project.store.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ProductDTO {
    String name;
    String asin;
    String imageUrl;
    String description;
    int unitPrice;
    String category;
    boolean active;
    int stockUnites;
    LocalDate dateCreated;
}
