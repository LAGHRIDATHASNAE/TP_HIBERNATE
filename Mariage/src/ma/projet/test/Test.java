/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;

import ma.projet.entities.Femme;
import ma.projet.entities.Homme;
import ma.projet.entities.Mariage;
import ma.projet.entities.MariageKey;

import ma.projet.service.FemmeService;
import ma.projet.service.HommeService;
import ma.projet.service.MariageService;
import ma.projet.util.HibernateUtil;
import org.hibernate.Hibernate;

/**
 *
 * @author Lachgar
 */
public class Test {
    
    public static void main(String[] args) {
        
         HommeService h = new HommeService();
         FemmeService f = new FemmeService(); 
         MariageService ms = new MariageService();
         
        
       /* h.create(new Homme("Mohammed","Mohammed","0642020274","ENSAJ",new Date()));
        h.create(new Homme("Ali","Ali","0642020274","ENSAJ",new Date()));
        h.create(new Homme("Ali","Ali","0642020274","ENSAJ",new Date()));
        h.create(new Homme("Safi","Safi","0642020254","ENSAJ",new Date()));
        h.create(new Homme("Said","Said","0643500254","ENSAJ",new Date()));
        
        f.create(new Femme("Salima","Rami","0643500254","ENSAJ",new Date()));
        f.create(new Femme("Amal","Ali","0643500254","ENSAJ",new Date()));
        f.create(new Femme("Wafa","Alaoui","0643500254","ENSAJ",new Date()));
        f.create(new Femme("Karima","Alami","0643500254","ENSAJ",new Date()));
        f.create(new Femme("Hasnae","Laghridat","0643500254","ENSAJ",new Date()));
        f.create(new Femme("Sanaa","Oulqaid","0643500254","ENSAJ",new Date()));
        f.create(new Femme("Zineb","Taghia","0643500254","ENSAJ",new Date()));
        f.create(new Femme("Fadwa","Tayanne","0643500254","ENSAJ",new Date()));
        f.create(new Femme("Oumaima","kharfati","0643500254","ENSAJ",new Date()));
        f.create(new Femme("Samiya","Elbettachi","0643500254","ENSAJ",new Date()));
        
       Femme ff = f.findById(7);
       System.out.println("-----------------"+ff.getNom());
      
       for(Femme fm : f.findAll(null)){
            System.out.println("Femme : "+fm.getNom()+" "+fm.getPrenom());
       }
       
      Mariage m2 = new Mariage(new MariageKey(h.findById(1).getId(), f.findById(7).getId()),h.findById(1), f.findById(7), new Date(), new Date(),2);
      Mariage m1 = new Mariage(new MariageKey(h.findById(1).getId(), f.findById(8).getId()),h.findById(1), f.findById(8), new Date(), new Date(),1);
      Mariage m3 = new Mariage(new MariageKey(h.findById(1).getId(), f.findById(9).getId()),h.findById(1), f.findById(9), new Date(), new Date(),1);
      Mariage m4 = new Mariage(new MariageKey(h.findById(2).getId(), f.findById(9).getId()),h.findById(2), f.findById(9), new Date(), new Date(),1);

      ms.create(m2);
      ms.create(m1);
      ms.create(m3);
      ms.create(m4);  */
      for(Mariage m :ms.MariageDeuxOuPlus()){
             System.out.println("Femme:"+m.getFemme());
      }
             
    
    
    
}
}
  
    
    


