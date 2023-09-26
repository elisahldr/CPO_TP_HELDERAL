/* Helderal
*TP1
*TDA2
*apprendre à utiliser java
*26 septempbre 2023
*/
package tp1_manipnombresint_helderal;

import java.util.Scanner;

/**
 *
 * @author elisa
 */
public class TP1_manipNombresInt_HELDERAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
System.out.println("saisissez deux entiers :");
int var1=sc.nextInt();
int var2=sc.nextInt();
System.out.println("entiers saisis: "+var1+" et "+var2);
int somme=var1+var2;
int difference=var1-var2;
int produit=var1*var2; 
System.out.println("La somme de vos entiers est "+somme+ "\n La difference entre vos entiers est "+difference+ "\n Le produit de vos entiers est: "+produit);
int quotEntier=var1/var2;
int quotReste=var1%var2;
System.out.println("Le quotient de vos 2 entiers est : "+quotEntier+","+quotReste);


    }
    
}
