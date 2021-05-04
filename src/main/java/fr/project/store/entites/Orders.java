package fr.project.store.entites;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int id;
    @Column(name="created_at")
    private LocalDate createdAt;
    @Column(name="shipped_at")
    private LocalDate shippedAt;
    private String status;
    private double total;
    @OneToMany(mappedBy = "orders")
    private Set<OrderLine> orderLines;
    @OneToOne
    private Shipping shipping;
    @OneToOne(mappedBy = "orders")
    private Payment payment;
    @ManyToOne
    private User user;



}
