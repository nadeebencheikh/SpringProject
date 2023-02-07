package com.esprit.springproject.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "Skieur")
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idSkieur")
    private Integer idSkieur; // Clé primaire
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;
    @ManyToMany
    private Set<Piste> pistes;
    @OneToMany( mappedBy = "skieur")
    private Set<Inscription> inscriptions;
    @OneToOne
    private Abonnement abonnement;
}
