/*
* Helderal
*TP2
*TDA2
*apprendre � utiliser java
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
     * �teint toutes les cellules de la grille. Cette m�thode parcourt la grille
     * et �teint chaque cellule lumineuse en appelant sa m�thode
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
     * mani�re al�atoire. Cette m�thode utilise un g�n�rateur de nombres
     * al�atoires pour choisir al�atoirement entre activer une ligne, une
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
 * M�lange la matrice de cellules lumineuses de mani�re al�atoire.
 *
 * @param nbTours Le nombre de tours de m�lange � effectuer.
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
 * Active toutes les cellules d'une ligne sp�cifi�e de la grille.
 *
 * @param idLigne L'indice de la ligne � activer (0 pour la premi�re ligne, 1 pour la deuxi�me, etc.).
 */
    public void activerLigneDeCellules(int idLigne) {
        if (idLigne >= 0 && idLigne < nbLignes) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[idLigne][j].activerCellule();
            }
        }
    }

   /**
 * Active toutes les cellules d'une colonne sp�cifi�e de la grille.
 *
 * @param idColonne L'indice de la colonne � activer (0 pour la premi�re colonne, 1 pour la deuxi�me, etc.).
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
 * La diagonale descendante part du coin sup�rieur gauche (0,0) et se dirige vers le coin
 * inf�rieur droit (nbLignes-1, nbColonnes-1).
 */
    public void activerDiagonaleDescendante() {
    for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
        matriceCellules[i][i].activerCellule();
    }
}

/**
 * Active la diagonale montante de la grille en allumant les cellules correspondantes.
 * Notez que la diagonale montante part du coin inf�rieur gauche (nbLignes-1, 0) et se dirige vers le
 * coin sup�rieur droit (0, nbColonnes-1).
 */
public void activerDiagonaleMontante() {
    for (int i = nbLignes - 1, j = 0; i >= 0 && j < nbColonnes; i--, j++) {
        matriceCellules[i][j].activerCellule();
    }
}

/**
 * V�rifie si toutes les cellules de la grille sont �teintes.
 *
 * @return true si toutes les cellules sont �teintes, false sinon.
 */
public boolean cellulesToutesEteintes() {
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            if (matriceCellules[i][j].getEtat()) {
                return false; // Au moins une cellule est allum�e
            }
        }
    }
    return true; // Toutes les cellules sont �teintes
}

}
