/*
* Helderal
*TP2
*TDA2
*apprendre � utiliser java
*25 octobre 2023
 */
package lightoff_helderal_version_console;

/**
 *
 * @author elisa
 */
public class LightOff_HELDERAL_version_console {

   
 public static void main(String[] args) {
        // Cr�ez une grille de jeu avec 4 lignes et 4 colonnes
        GrilleDeJeu grille = new GrilleDeJeu(4, 4);

        // Affichez l'�tat initial de la grille
        System.out.println("�tat initial de la grille :");
        System.out.println(grille.toString());

        // M�langez la grille en effectuant 10 tours
        grille.melangerMatriceAleatoirement(10);
        System.out.println("Grille apr�s m�lange :");
        System.out.println(grille.toString());

        // Active une ligne, colonne ou diagonale al�atoirement
        grille.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println("Grille apr�s activation al�atoire :");
        System.out.println(grille.toString());

        // Active la diagonale descendante
        grille.activerDiagonaleDescendante();
        System.out.println("Grille apr�s activation de la diagonale descendante :");
        System.out.println(grille.toString());

        // Active la diagonale montante
        grille.activerDiagonaleMontante();
        System.out.println("Grille apr�s activation de la diagonale montante :");
        System.out.println(grille.toString());

        // Active la deuxi�me ligne (l'indice 1)
        grille.activerLigneDeCellules(1);
        System.out.println("Grille apr�s activation de la deuxi�me ligne :");
        System.out.println(grille.toString());

        // Active la troisi�me colonne (l'indice 2)
        grille.activerColonneDeCellules(2);
        System.out.println("Grille apr�s activation de la troisi�me colonne :");
        System.out.println(grille.toString());

        // V�rifie si toutes les cellules sont �teintes
        boolean toutesEteintes = grille.cellulesToutesEteintes();
        System.out.println("Toutes les cellules sont �teintes : " + toutesEteintes);
    }
}