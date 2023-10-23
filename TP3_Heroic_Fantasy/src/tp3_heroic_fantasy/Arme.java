/*
/* Helderal
*TP2
*TDA2
*apprendre à utiliser java
*8 octobre 2023
 */
package tp3_heroic_fantasy;

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
        String chaine = nom+""+niveauAttaque;
        return chaine;
        
    }
   
}
    
            
            

