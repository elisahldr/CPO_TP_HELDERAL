/*
/* Helderal
*TP2
*TDA2
*apprendre à utiliser java
*8 octobre 2023
 */
package Armes;

/**
 *
 * @author elisa
 */
public abstract class Arme {
    String nom; 
    int niveauAttaque=100;
    
   public Arme(String Nom, int NiveauAttaque) {
       nom=Nom;
       niveauAttaque=NiveauAttaque;
       
   }
    
    @Override
    public String toString() {
        String chaine = nom+"Niveau de l'attaque : "+niveauAttaque;
        return chaine;
        
    }
   
}
    
            
            

