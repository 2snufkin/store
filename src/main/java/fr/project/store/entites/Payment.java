package fr.project.store.entites;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double sum;
    private String currency;
    private String status;
    @Column(name = "card_type")
    private String cardType;
    @OneToOne
    private Orders orders;

}
