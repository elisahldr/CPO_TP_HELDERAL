/* Helderal
*TP0
*TDA2
*apprendre à utiliser java
*18 septemvre 2023
*/
package calculator;

import java.util.Scanner;

/**
 *
 * @author elisa
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) subtract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
         Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
int operateur=sc.nextInt();

System.out.println("\n Entrer premiere valeur :");
int operande1=sc.nextInt();

System.out.println("\n Entrer deuxieme valeur:");
int operande2=sc.nextInt();
      
int result=0;
if (operateur==1)
    result=operande1+operande2;
if (operateur==2)
    result=operande1-operande2;
if (operateur==3)
    result=operande1*operande2;
if (operateur==4)
    result=operande1/operande2;
if (operateur==5)
    result=operande1%operande2;

System.out.println("Le résultat est"+result);
  


    
    

    }
    
}
