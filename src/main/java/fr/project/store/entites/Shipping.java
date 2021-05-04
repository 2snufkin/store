package fr.project.store.entites;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

//Ready
@Entity
@Data

public class Shipping implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private double price;
    @Column(name = "delivery_date")
    private LocalDate deliveryDate;
    @ManyToOne//Uni.no mapped by in the Address
    private Address address;


}
