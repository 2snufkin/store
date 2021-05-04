package fr.project.store.entites;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String sku;
    private String image;
    private boolean active; //if it's active in the catalogue
    @Column(name="stock_units")
    private int stockUnites;
    private String description;
    @Column(name="unit_price")
    private BigDecimal unitPrice;
    @Column(name="date_created")
    private LocalDate dateCreated;
    @Column(name="date_modified")
    private LocalDate last_modified;
    @ManyToOne
    private Category category;


}
