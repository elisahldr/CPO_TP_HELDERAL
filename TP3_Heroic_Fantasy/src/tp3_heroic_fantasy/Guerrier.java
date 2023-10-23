/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy;

/**
 *
 * @author elisa
 */
public class Guerrier extends Personnages {
  private boolean cheval;
   
   
  public boolean isCheval() {
       return cheval;
   }
   
   
   public void setCheval(boolean cheval) {
       this.cheval=cheval;
       
   }
     public Guerrier(String nom, int niveauDeVie, String c ) {
        super(nom, niveauDeVie);
     
         if ("cheval".equals(c)) {
         cheval=true;
     }else cheval=false;
     
    }
    public String tostring() {
        return "Nom arme : "+ nom+ "\n Niveau de vie : "+niveauDeVie+ " Confirmé? : "+ cheval; 
    }
}
