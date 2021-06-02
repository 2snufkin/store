package fr.project.store.entites;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;


@Entity
@Data
public  class User {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    @OneToMany(mappedBy = "user")
    private Set<Orders> orders;


}
