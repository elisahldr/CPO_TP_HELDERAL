/*

/* Helderal
*TP2
*TDA2
*apprendre à utiliser java
*8 octobre 2023



 */
package tp3_heroic_fantasy;

import Armes.Arme;
import Armes.Epee;
import Armes.Baton;
import java.util.ArrayList;

/**
 *
 * @author elisa
 */
public class TP3_Heroic_Fantasy {


  
    public static void main(String[] args) {
        // TODO code application logic here
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);

        Baton baton1 = new Baton("Chene", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        System.out.println("Informations sur la premiere epee : " + epee1);

        System.out.println("\nInformations sur la deuxieme epee : " + epee2);

        System.out.println("\nInformations sur le premier baton : " +baton1);

        System.out.println("\nInformations sur le deuxieme baton : " +baton2);
        
        ArrayList<Arme> TableauArmes = new ArrayList<>();
        TableauArmes.add(epee1);
        TableauArmes.add(epee2);
        TableauArmes.add(baton1);
        TableauArmes.add(baton2);
        
        for (int i = 0; i <TableauArmes.size(); i++) {
            System.out.println(TableauArmes.get(i));
            
            Guerrier guerrier1= new Guerrier ("Conan ",78,"pieds");
            Guerrier guerrier2= new Guerrier ("Lannister",45,"cheval");
            
           Magicien magicien1= new Magicien ("Gandalf",65,"confirme");
           Magicien magicien2= new Magicien ("Garcimore",44,"novice");
           
            
            System.out.println(guerrier1);

        System.out.println(guerrier2);

        System.out.println(magicien1);

        System.out.println(magicien2);
        
        
          ArrayList<Arme> TableauPersos = new ArrayList<>();
            for (int j = 0; j< TableauPersos.size(); j ++) {
                System.out.println(TableauPersos.get(j));
            }
            
        }

        
        
        
    }
    
}