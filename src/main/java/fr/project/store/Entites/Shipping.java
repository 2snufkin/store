package fr.project.store.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

//Ready
@Entity

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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
