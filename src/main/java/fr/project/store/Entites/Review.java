package fr.project.store.Entites;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@Table(name="_review")
public class Review implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String type;
    private String content;
    @Column(name="created")
    private LocalDate createdAt;
    private String note;
    @OneToOne
    private OrderLine orderLine;

}
