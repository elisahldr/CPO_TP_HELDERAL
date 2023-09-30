
/* Helderal
*TP1
*TDA2
*apprendre à utiliser java
*26 septempbre 2023
package tp1_guessMyNumber_helderal;


/**
 *
 * @author elisa
 */
public class TP1_guessMyNumber_HELDERAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = generateurAleat.nextInt(100);
        int nombreSaisi=sc.nextInt();
        while (nombreSaisi!=number) {
            if (nombreSaisi<number) {
                System.out.println("nombre trop petit");
                nombreSaisi=sc.nextInt();
            }if (nombreSaisi>number) {
                System.out.println("nombre trop grang");
                nombreSaisi=sc.nextInt();   
            }
        }
        System.out.println("Correct! le nombre a deviner etait bien"+number);
        
        
        
        
        
    }
    
}
