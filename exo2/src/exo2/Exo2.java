/* Helderal
*TP0
*TDA2
*apprendre à utiliser java
*18 septemvre 2023
*/
package exo2;

import java.util.Scanner;

/**
 *
 * @author elisa
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
//Declaration des variables
int nb = 0; // nombre dentiers a additionner
int result; // resultat
int ind; //indice
//nb=5;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier
result=0;
// Addition des nb premiers entiers
ind=1;
while (ind <= nb) {
result=result+ind;
ind=ind+1;
}
// Affichage du resultat
System.out.println();
System.out.println("La somme des "+ nb + "entiers est: "+result);


}
}

