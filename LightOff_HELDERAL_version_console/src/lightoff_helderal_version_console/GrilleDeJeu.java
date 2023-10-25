/*
* Helderal
*TP2
*TDA2
*apprendre à utiliser java
*25 octobre 2023
 */
package lightoff_helderal_version_console;

import java.util.Random;

/**
 *
 * @author elisa
 */
public class GrilleDeJeu {

    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

    /**
     * Constructeur de la classe GrilleDeJeu.
     *
     * @param p_nbLignes Le nombre de lignes de la grille.
     * @param p_nbColonnes Le nombre de colonnes de la grille.
     */
    public void GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    /**
     * Éteint toutes les cellules de la grille. Cette méthode parcourt la grille
     * et éteint chaque cellule lumineuse en appelant sa méthode
     * `eteindreCellule()`.
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    /**
     * Active une ligne, une colonne ou une diagonale de cellules lumineuses de
     * manière aléatoire. Cette méthode utilise un générateur de nombres
     * aléatoires pour choisir aléatoirement entre activer une ligne, une
     * colonne ou une diagonale. Ensuite, elle active les cellules
     * correspondantes dans la grille.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random rand = new Random();
        int choix = rand.nextInt(3);
        if (choix == 0) {
            int ligne = rand.nextInt(nbLignes);
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[ligne][j].activerCellule();
            }
        } else if (choix == 1) {
            int colonne = rand.nextInt(nbColonnes);
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][colonne].activerCellule();
            }
        } else {
            for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
                matriceCellules[i][i].activerCellule();
            }
        }
    }

   /**
 * Mélange la matrice de cellules lumineuses de manière aléatoire.
 *
 * @param nbTours Le nombre de tours de mélange à effectuer.
 */
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();
        Random rand = new Random();
        for (int tour = 0; tour < nbTours; tour++) {
            int choix = rand.nextInt(3);

            if (choix == 0) {
                int ligne = rand.nextInt(nbLignes);
                for (int j = 0; j < nbColonnes; j++) {
                    matriceCellules[ligne][j].activerCellule();
                }
            } else if (choix == 1) {
                int colonne = rand.nextInt(nbColonnes);
                for (int i = 0; i < nbLignes; i++) {
                    matriceCellules[i][colonne].activerCellule();
                }
            } else {
                for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
                    matriceCellules[i][i].activerCellule();
                }
            }
        }

    }

   /**
 * Active toutes les cellules d'une ligne spécifiée de la grille.
 *
 * @param idLigne L'indice de la ligne à activer (0 pour la première ligne, 1 pour la deuxième, etc.).
 */
    public void activerLigneDeCellules(int idLigne) {
        if (idLigne >= 0 && idLigne < nbLignes) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[idLigne][j].activerCellule();
            }
        }
    }

   /**
 * Active toutes les cellules d'une colonne spécifiée de la grille.
 *
 * @param idColonne L'indice de la colonne à activer (0 pour la première colonne, 1 pour la deuxième, etc.).
 */
    public void activerColonneDeCellules(int idColonne) {
        if (idColonne >= 0 && idColonne < nbColonnes) {
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][idColonne].activerCellule();
            }
        }
    }

   /**
 * Active la diagonale descendante de la grille en allumant les cellules correspondantes.
 * La diagonale descendante part du coin supérieur gauche (0,0) et se dirige vers le coin
 * inférieur droit (nbLignes-1, nbColonnes-1).
 */
    public void activerDiagonaleDescendante() {
    for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
        matriceCellules[i][i].activerCellule();
    }
}

/**
 * Active la diagonale montante de la grille en allumant les cellules correspondantes.
 * Notez que la diagonale montante part du coin inférieur gauche (nbLignes-1, 0) et se dirige vers le
 * coin supérieur droit (0, nbColonnes-1).
 */
public void activerDiagonaleMontante() {
    for (int i = nbLignes - 1, j = 0; i >= 0 && j < nbColonnes; i--, j++) {
        matriceCellules[i][j].activerCellule();
    }
}

/**
 * Vérifie si toutes les cellules de la grille sont éteintes.
 *
 * @return true si toutes les cellules sont éteintes, false sinon.
 */
public boolean cellulesToutesEteintes() {
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            if (matriceCellules[i][j].getEtat()) {
                return false; // Au moins une cellule est allumée
            }
        }
    }
    return true; // Toutes les cellules sont éteintes
}

}
