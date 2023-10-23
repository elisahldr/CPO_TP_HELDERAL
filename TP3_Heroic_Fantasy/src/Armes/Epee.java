/*
/* Helderal
*TP2
*TDA2
*apprendre à utiliser java
*8 octobre 2023
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author elisa
 */
public class Epee extends Arme {
   int IndiceFinesse;
   
    public Epee(String nom, int niveauAttaque, int IndiceFinesse) {
        super(nom, niveauAttaque);
        this.IndiceFinesse=IndiceFinesse;
        
        
        
    }
    public String tostring() {
        return "Nom arme : "+ nom+ "\n Niveau de l'attaque : "+niveauAttaque+ "Indice finesse : "+ IndiceFinesse; 
    }
}
