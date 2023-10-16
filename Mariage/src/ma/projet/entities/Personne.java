/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entities;

/**
 *
 * @author lenovo
 */
import java.util.Date;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "personnes")
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String nom;
    private String prenom;
    private String telephone;
    private String adresse;
     @Temporal(javax.persistence.TemporalType.DATE)
    private Date DateNaissance;
     
     public Personne(){}

    public Personne(String nom, String prenom, String telephone, String adresse, Date DateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.DateNaissance = DateNaissance;
    }

    public int getId() {
        return id;
    }

    public String getAdresse() {
        return adresse;
    }

    public Date getDateNaissance() {
        return DateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setDateNaissance(Date DateNaissance) {
        this.DateNaissance = DateNaissance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    


}
