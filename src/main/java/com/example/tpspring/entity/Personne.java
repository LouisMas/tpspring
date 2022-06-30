package com.example.tpspring.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Inheritance
public abstract class Personne {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
@Column(name = "civilite")
    private String civilite;
@Column(name = "nom")
@NotNull
@Size(max = 50)
    private String nom;
@Column(name = "prenom")
@NotNull
@Size(max = 50)
    private String prenom;
@Column(name = "email")
@NotNull
    private String email;
@Column(name = "adresse")
@NotNull
    private String adresse;

    public Personne() {
        super();
    }

    public Personne(Long id, String civilite, String nom, String prenom, String email, String adresse) {
        this.id = id;
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
