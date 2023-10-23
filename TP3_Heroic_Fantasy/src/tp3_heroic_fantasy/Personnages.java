/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy;

/**
 *
 * @author elisa
 */
public abstract class Personnages {
   
    String nom; 
    int niveauDeVie=100;
    
   public Personnages (String Nom, int NiveauDeVie) {
       nom=Nom;
       niveauDeVie=NiveauDeVie;
       
   }

    @Override
    public String toString() {
        String chaine = nom+""+niveauDeVie;
        return chaine;
        
    }
    
}
