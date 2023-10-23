/*
/* Helderal
*TP2
*TDA2
*apprendre à utiliser java
*23 octobre 2023
 */
package tp3_heroic_fantasy;

/**
 *
 * @author elisa
 */
public class Baton extends Arme {
   int AgeBaton;
     public Baton(String nom, int niveauAttaque, int AgeBaton) {
        super(nom, niveauAttaque);
        this.AgeBaton=AgeBaton;
        
        
    }
    public String tostring() {
        return "Nom arme : "+ nom+ "\n Niveau de l'attaque : "+niveauAttaque+ "Age baton : "+ AgeBaton; 
}
    
}