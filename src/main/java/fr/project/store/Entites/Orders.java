package fr.project.store.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity

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


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getShippedAt() {
        return shippedAt;
    }

    public void setShippedAt(LocalDate shippedAt) {
        this.shippedAt = shippedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Set<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(Set<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
