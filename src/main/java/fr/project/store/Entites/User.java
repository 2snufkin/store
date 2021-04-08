package fr.project.store.Entites;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
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
    @Column (name = "user_name", unique = true)
    private String userName;
    @Column(unique = true)
    private String email;
    private String password;
    @Enumerated(value = EnumType.STRING)
    private Role role;
    private LocalDate inscriptionDate;

    @OneToMany(mappedBy = "user")
    private Set<Orders> orders;


}
