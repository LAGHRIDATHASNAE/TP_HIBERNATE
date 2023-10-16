/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;

/**
 *
 * @author lenovo
 */
@Embeddable
public class MariageKey implements Serializable{
    private int homme;
    private int femme;
    
    public MariageKey() {
    }
    public MariageKey(int homme, int femme) {
    this.homme = homme;
    this.femme = femme;
    }
 }
