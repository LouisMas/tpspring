package com.example.tpspring.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "matiere")
public class Matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long matiereId;
    @Column(name = "nommatiere")
    @NotNull
    @Size(max = 50)
    private String nom;
    @Column(name = "duree")
    @DateTimeFormat
    private Date duree;
@Column(name = "difficulte")
    private int difficulte;

    @Column(name = "findbyformateur")
    @ManyToMany(mappedBy = "enseigner")
    private List<Formateur> findByFormateur;

    public Matiere(Long matiereId, String nom, Date duree, int difficulte) {
        this.matiereId = matiereId;
        this.nom = nom;
        this.duree = duree;
        this.difficulte = difficulte;
    }

    public Matiere() {
        super();
    }

    public Long getMatiereId() {
        return matiereId;
    }

    public void setMatiereId(Long matiereId) {
        this.matiereId = matiereId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDuree() {
        return duree;
    }

    public void setDuree(Date duree) {
        this.duree = duree;
    }

    public int getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(int difficulte) {
        this.difficulte = difficulte;
    }
}
