/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entities;

import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;

@NamedNativeQuery(name="nbrEnfantsByFemme" ,query="select count(nbrEnfants) from Mariage where femme=7;",resultClass=Mariage.class)
@NamedQuery(name="MariageDeuxouPlus", query="SELECT m.femme, COUNT(m.homme) FROM Mariage m GROUP BY m.femme HAVING COUNT(m.homme) >= 2")
@Entity
public class Mariage {
@EmbeddedId
private MariageKey id;

 @JoinColumn(name = "homme", referencedColumnName = "id", insertable = false, updatable = false)
 @ManyToOne
 private Homme homme;
 @JoinColumn(name = "femme", referencedColumnName = "id", insertable = false, updatable = false)
 @ManyToOne
 private Femme femme;
 private int nbrEnfants;
 @Temporal(javax.persistence.TemporalType.DATE)
 private Date dateDebut;
@Temporal(javax.persistence.TemporalType.DATE)
 private Date dateFin;
 public Mariage() {
 }

    public Mariage(MariageKey id, Homme homme, Femme femme,Date dateDebut, Date dateFin, int nbrEnfants ) {
        this.id = id;
        this.homme = homme;
        this.femme = femme;
        this.dateDebut= dateDebut;
        this.dateFin = dateFin;
        this.nbrEnfants = nbrEnfants;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public Femme getFemme() {
        return femme;
    }

    public Homme getHomme() {
        return homme;
    }

    public MariageKey getId() {
        return id;
    }

    public int getNbrEnfants() {
        return nbrEnfants;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setFemme(Femme femme) {
        this.femme = femme;
    }

    public void setHomme(Homme homme) {
        this.homme = homme;
    }

    public void setId(MariageKey id) {
        this.id = id;
    }

    public void setNbrEnfants(int nbrEnfants) {
        this.nbrEnfants = nbrEnfants;
    }
 
   

    
}
