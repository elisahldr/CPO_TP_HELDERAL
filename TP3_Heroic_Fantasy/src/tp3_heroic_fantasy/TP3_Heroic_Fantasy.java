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
public class TP3_Heroic_Fantasy {

    /**
     * @param args the command line arguments
     */
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

        
        
        
    }
    
}
