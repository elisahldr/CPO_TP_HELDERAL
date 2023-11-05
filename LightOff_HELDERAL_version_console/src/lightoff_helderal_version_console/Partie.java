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
    private int nbCoupsMax;

    public Partie() {
        choisirNiveauDifficulte();
        grille = new GrilleDeJeu(4, 4);
        nbCoups = 0;

    }

    /**
     * Constructeur de la classe Partie. Cr�e une nouvelle partie en
     * initialisant la grille de jeu et le compteur de coups
     */
    public enum NiveauDifficulte {
        FACILE, MOYEN, DIFFICILE
    }

    private NiveauDifficulte niveauDifficulte;

    /**
     * Initialise une nouvelle partie du jeu LightOff en m�langeant
     * al�atoirement la grille.
     *
     */
    public void choisirNiveauDifficulte() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez un niveau de difficult� :");
        System.out.println("1) Facile");
        System.out.println("2) Moyen");
        System.out.println("3) Difficile");
        System.out.print("Entrez le num�ro du niveau de difficult� : ");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                niveauDifficulte = NiveauDifficulte.FACILE;
                break;
            case 2:
                niveauDifficulte = NiveauDifficulte.MOYEN;
                break;
            case 3:
                niveauDifficulte = NiveauDifficulte.DIFFICILE;
                break;
            default:
                System.out.println("Choix invalide. Niveau moyen choisi par d�faut.");
                niveauDifficulte = NiveauDifficulte.MOYEN;
                break;
        }
    }

    public Partie(NiveauDifficulte niveauDifficulte) {
        this.niveauDifficulte = niveauDifficulte;

        if (niveauDifficulte == NiveauDifficulte.FACILE) {
            nbCoupsMax = Integer.MAX_VALUE; // Nombre de coups illimit�
        } else if (niveauDifficulte == NiveauDifficulte.MOYEN) {
            nbCoupsMax = 20;
        } else if (niveauDifficulte == NiveauDifficulte.DIFFICILE) {
            nbCoupsMax = 8;
        }
    }

    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(4);
    }

    /**
     * Lance une partie du jeu
     */
    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu LightOff!");

        while (grille.cellulesToutesEteintes() != true) {
            if (grille.cellulesToutesEteintes()) {
                System.out.println("F�licitations! Vous avez �teint toutes les cellules en " + nbCoups + " coups.");
                break;
            }

            if (nbCoups > nbCoupsMax) {
                System.out.println("Nombre maximum de coups atteint. Vous avez perdu.");
                break;
            }
            System.out.println(grille);
            System.out.println("Choisissez l'action :");
            System.out.println("1) Activer une ligne");
            System.out.println("2) Activer une colonne");
            System.out.println("3) Activer la diagonale montante");
            System.out.println("4) Activer la diagonale descendante");
            System.out.println("Entrez le num�ro de l'action : ");
            int action = scanner.nextInt();
            switch (action) {
                case 1 -> {
                    System.out.println("Entrez le num�ro de la ligne � activer : ");
                    int ligneChoisie = scanner.nextInt();
                    grille.activerLigneDeCellules(ligneChoisie);
                }
                case 2 -> {
                    System.out.println("Entrez le num�ro de la colonne � activer : ");
                    int colonneChoisie = scanner.nextInt();
                    grille.activerColonneDeCellules(colonneChoisie);
                }
                case 3 ->
                    grille.activerDiagonaleMontante();
                case 4 ->
                    grille.activerDiagonaleDescendante();
                default ->
                    System.out.println("Choix invalide. Veuillez choisir une autre action");

            }
            nbCoups++;
            System.out.println("Nombre de coups : " + nbCoups);
            grille.toString();
        }
        System.out.println("F�licitations! Vous avez �teint toutes les cellules en " + nbCoups + " coups.");
    }
}
