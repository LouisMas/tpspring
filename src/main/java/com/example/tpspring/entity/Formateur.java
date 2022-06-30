package com.example.tpspring.entity;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "formateur")
public class Formateur extends Personne{

@Column(name = "dateembauche")
@DateTimeFormat
    private Date dateEmbauche;
@Column(name = "experience")
    private String experience;
@Column(name = "status")
    private String status;
@OneToMany(mappedBy = "formateur")
@NotNull
    private List<Stagiaire> findByStagiaire;
@Column(name = "enseigner")
@ManyToMany
@JoinTable(name = "matiere", joinColumns = @JoinColumn(name = "enseigner"),inverseJoinColumns = @JoinColumn(name = "findbyformateur"))
    private List<Matiere> enseigner;

    public Formateur(Date dateEmbauche, String experience, String status, List<Stagiaire> findByStagiaire, List<Matiere> enseigner) {
        this.dateEmbauche = dateEmbauche;
        this.experience = experience;
        this.status = status;
        this.findByStagiaire = findByStagiaire;
        this.enseigner = enseigner;
    }

    public Formateur(String civilite, String nom, String prenom, String email, String adresse, Long id, Date dateEmbauche, String experience, String status, List<Stagiaire> findByStagiaire, List<Matiere> enseigner) {
        super(id, civilite, nom, prenom, email, adresse);
        this.dateEmbauche = dateEmbauche;
        this.experience = experience;
        this.status = status;
        this.findByStagiaire = findByStagiaire;
        this.enseigner = enseigner;
    }

    public Formateur() {

    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Stagiaire> getFindByStagiaire() {
        return findByStagiaire;
    }

    public void setFindById(List<Stagiaire> findByStagiaire) {
        this.findByStagiaire = findByStagiaire;
    }

    public List<Matiere> getEnseigner() {
        return enseigner;
    }

    public void setEnseigner(List<Matiere> enseigner) {
        this.enseigner = enseigner;
    }
}
