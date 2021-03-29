package fr.project.store.Entites;

import javax.persistence.*;
import java.io.Serializable;

//Ready
@Entity
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String adressLine;
    private String adressLine2;
    private String zip;
    private String city;
    private String country;
    private String phoneNumber;
    @ManyToOne //uni-directional
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

    public String getAdressLine() {
        return adressLine;
    }

    public void setAdressLine(String adressLine) {
        this.adressLine = adressLine;
    }

    public String getAdressLine2() {
        return adressLine2;
    }

    public void setAdressLine2(String adressLine2) {
        this.adressLine2 = adressLine2;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User getClient() {
        return user;
    }

    public void setClient(User user) {
        this.user = user;
    }
}
