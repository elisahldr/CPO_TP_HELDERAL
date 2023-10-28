/*
* Helderal
*TP2
*TDA2
*apprendre � utiliser java
*25 octobre 2023
 */
package lightoff_helderal_version_console;

import java.util.Scanner;

/**
 *
 * @author elisa
 */
public class Partie {

    private GrilleDeJeu grille;
    private int nbCoups;
    
    
    /**
     * Constructeur de la classe Partie.
     * Cr�e une nouvelle partie en initialisant la grille de jeu et le compteur de coups.
     */
    public Partie() {
        grille = new GrilleDeJeu(4,4); 
        nbCoups = 0; 
    }
    /**
     * Initialise une nouvelle partie du jeu LightOff en m�langeant al�atoirement la grille.
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(4); 
    }
    /**
 * Lance une partie du jeu LightOff, permettant au joueur de jouer jusqu'� ce que toutes les cellules soient �teintes.
 */
     public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);
      System.out.println("Bienvenue dans le jeu LightOff!");

        while (grille.cellulesToutesEteintes()!=true) {
            System.out.println(grille);
            System.out.println("Choisissez l'action :");
            System.out.println("1) Activer une ligne");
            System.out.println("2) Activer une colonne");
            System.out.println("3) Activer la diagonale montante");
            System.out.println("4) Activer la diagonale descendante");
            System.out.println("Entrez le num�ro de l'action : ");
            int action = scanner.nextInt();
            switch(action){
                case 1 -> {
                    System.out.println("Entrez le num�ro de la ligne � activer : ");
                    int ligneChoisie = scanner.nextInt();
                    grille.activerLigneDeCellules(ligneChoisie);
                }
                case 2 ->{
                    System.out.println("Entrez le num�ro de la colonne � activer : ");
                    int colonneChoisie = scanner.nextInt();
                    grille.activerColonneDeCellules(colonneChoisie);
                }
                case 3 -> grille.activerDiagonaleMontante();
                case 4 -> grille.activerDiagonaleDescendante();
                default -> System.out.println("Choix invalide. Veuillez choisir une autre action");
                
                
            }
            nbCoups++;
            System.out.println("Nombre de coups : "+nbCoups);
            grille.toString();
        }
        System.out.println("F�licitations! Vous avez �teint toutes les cellules en "+nbCoups+" coups.");
     }
}
            
            
            
    