
import java.util.Random;


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
        Random generateurAleat = new Random();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Quelle difficulte souhaitez vous? \n 1-Facile \n 2-Moyen \n 3-Difficile");
        int saisiemenu = sc.nextInt();
        if (saisiemenu == 1) {
            int n = generateurAleat.nextInt(100);
            System.out.println("Vous avez choisis le mode facile. Vous aurez un nombre de tentatives ilimite. Le nombre a deviner est entre 0 et 100");

            System.out.println("Saisissez un premier nombre!:");
            int nombreSaisi = sc.nextInt();
            int nbTentatives = 1;
            while (nombreSaisi != n) {
                if (nombreSaisi < n) {
                    System.out.println("nombre trop petit");
                    nombreSaisi = sc.nextInt();
                    nbTentatives = nbTentatives + 1;

                }
                if (nombreSaisi > n) {
                    System.out.println("nombre trop grand");
                    nombreSaisi = sc.nextInt();
                    nbTentatives = nbTentatives + 1;
                }
            }
            System.out.println("Correct! le nombre a deviner etait bien " + n + "\nVous avez effectue " + nbTentatives);
        }
        if (saisiemenu == 2) {
            int n = generateurAleat.nextInt(300);
            System.out.println("Vous avez choisis le mode moyen. Vous aurez un nombre de tentatives ilimite mais le nombre a deviner est compris entre 0 et 300");

            System.out.println("Saisissez un premier nombre!:");
            int nombreSaisi = sc.nextInt();
            int nbTentatives = 1;
            while (nombreSaisi != n) {
                if (nombreSaisi < n) {
                    System.out.println("nombre trop petit");
                    nombreSaisi = sc.nextInt();
                    nbTentatives = nbTentatives + 1;

                }
                if (nombreSaisi > n) {
                    System.out.println("nombre trop grand");
                    nombreSaisi = sc.nextInt();
                    nbTentatives = nbTentatives + 1;
                }
            }

            System.out.println("Correct! le nombre a deviner etait bien " + n + "\nVous avez effectue " + nbTentatives);
        }
        if (saisiemenu == 3) {
            int n = generateurAleat.nextInt(300);
            System.out.println("Vous avez choisis le mode difficile. Vous aurez un nombre de tentatives limite a 7 et le nombre a deviner est compris entre 0 et 300");

            System.out.println("Saisissez un premier nombre!:");
            int nombreSaisi = sc.nextInt();
            int nbTentatives = 1;

            while (nombreSaisi != n && nbTentatives < 7) {
                if (nombreSaisi < n) {
                    System.out.println("nombre trop petit");
                    nombreSaisi = sc.nextInt();
                    nbTentatives = nbTentatives + 1;

                }
                if (nombreSaisi > n) {
                    System.out.println("nombre trop grand");
                    nombreSaisi = sc.nextInt();
                    nbTentatives = nbTentatives + 1;
                }
            }
            if (nbTentatives < 7) {
                System.out.println("Correct! le nombre a deviner etait bien " + n + "\nVous avez effectue " + nbTentatives);
            } else {
                 System.out.println("Vous avez depasse le nombre de tentatives autorisees... Le nombre a deviner etait " + n);
            }
        }

    }
}

