/*
* Helderal
*TP2
*TDA2
*apprendre à utiliser java
*25 octobre 2023
 */
package lightoff_helderal_version_console;

/**
 *
 * @author elisa
 */
public class LightOff_HELDERAL_version_console {

   
 public static void main(String[] args) {
        // Créez une grille de jeu avec 4 lignes et 4 colonnes
        GrilleDeJeu grille = new GrilleDeJeu(4, 4);

        // Affichez l'état initial de la grille
        System.out.println("État initial de la grille :");
        System.out.println(grille.toString());

        // Mélangez la grille en effectuant 10 tours
        grille.melangerMatriceAleatoirement(10);
        System.out.println("Grille après mélange :");
        System.out.println(grille.toString());

        // Active une ligne, colonne ou diagonale aléatoirement
        grille.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println("Grille après activation aléatoire :");
        System.out.println(grille.toString());

        // Active la diagonale descendante
        grille.activerDiagonaleDescendante();
        System.out.println("Grille après activation de la diagonale descendante :");
        System.out.println(grille.toString());

        // Active la diagonale montante
        grille.activerDiagonaleMontante();
        System.out.println("Grille après activation de la diagonale montante :");
        System.out.println(grille.toString());

        // Active la deuxième ligne (l'indice 1)
        grille.activerLigneDeCellules(1);
        System.out.println("Grille après activation de la deuxième ligne :");
        System.out.println(grille.toString());

        // Active la troisième colonne (l'indice 2)
        grille.activerColonneDeCellules(2);
        System.out.println("Grille après activation de la troisième colonne :");
        System.out.println(grille.toString());

        // Vérifie si toutes les cellules sont éteintes
        boolean toutesEteintes = grille.cellulesToutesEteintes();
        System.out.println("Toutes les cellules sont éteintes : " + toutesEteintes);
    }
}