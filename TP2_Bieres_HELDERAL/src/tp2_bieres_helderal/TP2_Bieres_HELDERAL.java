/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_helderal;

/**
 *
 * @author elisa
 */
public class TP2_Bieres_HELDERAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herec 
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0,"Dubuisson");
                uneBiere.lireEtiquette();
        
      BouteilleBiere deuxBiere = new BouteilleBiere("Manon", 4.2,"L'exceptionnelle");
                deuxBiere.lireEtiquette();
               
      BouteilleBiere troisBiere = new BouteilleBiere("Camille", 11.1,"Le cri du Gabon");
                troisBiere.lireEtiquette();
                
      BouteilleBiere quatreBiere = new BouteilleBiere("Elisa",15.2,"J'ai fini mon etude de doc");
      quatreBiere.lireEtiquette();
      
        
        
     

    }

}
