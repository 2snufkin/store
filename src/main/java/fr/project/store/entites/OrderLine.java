package fr.project.store.entites;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class OrderLine implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantity;
    private double unitPrice;
    private double total;
    @OneToOne(mappedBy = "orderLine")
    private Review review;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Orders orders;

}
