/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entities;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
@Entity
@Table(name = "homme")
public class Homme extends Personne {
    public Homme(){}
    public Homme(String nom, String prenom, String telephone, String adresse, Date DateNaissance) {
        super(nom, prenom, telephone, adresse, DateNaissance);
    }
    @OneToMany(mappedBy = "homme")
    private List<Mariage> mariages;

 
    

}
