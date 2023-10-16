/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author lenovo
 */
@Entity
public class Client extends User{
   
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateNaissance;
    private String nom;
    private String prenom;
    private String code;

    @Override
    public void setPassword(String password) {
        super.setPassword(password); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword() {
        return super.getPassword(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String getEmail() {
        return super.getEmail(); //To change body of generated methods, choose Tools | Templates.
    }

    public Client() {
    }

    public Client(String email, String password,Date dateNaissance, String nom, String prenom, String code) {
        super(email,password);
        this.dateNaissance = dateNaissance;
        this.nom = nom;
        this.prenom = prenom;
        this.code=code;
        
      
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getId() {
        return id;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
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
    
    
}
