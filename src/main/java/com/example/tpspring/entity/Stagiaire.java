package com.example.tpspring.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "stagiaire")
public class Stagiaire extends Personne{
    @Column(name = "datenaissance")
    @DateTimeFormat
    private Date dateNaissance;

    @ManyToOne
    @NotNull
    private Formateur formateur;

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public Stagiaire(Date dateNaissance, Formateur formateur) {
        this.formateur = formateur;
        this.dateNaissance = dateNaissance;
    }

    public Stagiaire(Long id, String civilite, String nom, String prenom, String email, String adresse, Long id1, Date dateNaissance) {
        super(id, civilite, nom, prenom, email, adresse);
        this.dateNaissance = dateNaissance;
    }

    public Stagiaire() {
        super();
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

}
