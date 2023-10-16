/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import ma.projet.entities.Client;
import ma.projet.services.ClientService;
import ma.projet.util.HibernateUtil;

/**
 *
 * @author lenovo
 */
public class Test {
     public static void main(String[] args) {
        //ClientService cs = new ClientService();
        /*cs.create(new Client("XS34", new Date()));
        cs.create(new Client("XS35", new Date()));
        cs.create(new Client("XS36", new Date()));*/
        /*cs.delete(cs.findById(3));
        for(Client c : cs.findAll(null))
            System.out.println(c);*/
        //cs.findById(4);
        
        HibernateUtil.getSessionFactory();
        
        ClientService cs = new ClientService();
         //fs.create(new Filiere("2ITE","Ingénierie informatique et technologie emergentes"));
        cs.create(new Client("laghridat@gmail.com",cs.MD5("Hasnae123"),new Date(),"Laghridat","hasnae",null));
        //System.out.print("-------"+fs.findById(2));
        //Filiere f = fs.findById(1);
         
        /*ps.create(new Employe("hasnae","hasnae",1000));
        ps.create(new Etudiant("laghridat","laghridat","K149036041",fs.findById(1)));*/
        
    }
    
}
