/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy;

/**
 *
 * @author elisa
 */
public class Magicien extends Personnages {
  private boolean confirme;
   
   
  public boolean isConfirme() {
       return confirme;
   }
   
   
   public void setConfirme(boolean confirme) {
       this.confirme=confirme;
       
       
   }
  
     public Magicien(String nom, int niveauDeVie, String c) {
        super(nom, niveauDeVie);
       
     if ("confirme".equals(c)) {
         confirme=true;
     }else confirme=false;
     }
     
     
     
    public String tostring() {
        return "Nom arme : "+ nom+ "\n Niveau de vie : "+niveauDeVie+ " Confirme?: "+ confirme; 
        
    }
}