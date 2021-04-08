package fr.project.store.Entites;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

//Ready
@Entity
@Data
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


}
