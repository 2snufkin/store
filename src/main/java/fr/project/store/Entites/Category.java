package fr.project.store.Entites;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Table(name="product_category")
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String category;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Product> products;


}
