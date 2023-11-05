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

    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    /**
     * Cr�e une nouvelle grille de cellules lumineuses.
     *
     * @param p_nbLignes Le nombre de lignes de la grille.
     * @param p_nbColonnes Le nombre de colonnes de la grille.
     */
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
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
     * �teint toutes les cellules de la grille.
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    /**
     * Active al�atoirement une ligne, une colonne ou une diagonale de cellules
     * dans la grille.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(3); // 0 pour ligne, 1 pour colonne, 2 pour diagonale

        if (choix == 0) {
            int ligne = random.nextInt(nbLignes);
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[ligne][j].activerCellule();
            }
        } else if (choix == 1) {
            int colonne = random.nextInt(nbColonnes);
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][colonne].activerCellule();
            }
        } else {
            for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                matriceCellules[i][i].activerCellule();
            }
        }
    }

    /**
     * M�lange al�atoirement les cellules de la grille en effectuant un nombre
     * sp�cifi� de tours.
     *
     * @param nbTours Le nombre de tours pour m�langer la grille.
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules(); // �teindre toutes les cellules au d�but

        Random random = new Random();

        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    /**
     * Active toutes les cellules d'une ligne sp�cifique de la grille.
     *
     * @param idLigne L'identifiant de la ligne � activer. Doit �tre un nombre
     * valide entre 0 et (nbLignes - 1).
     */
    public void activerLigneDeCellules(int idLigne) {
        if (idLigne >= 0 && idLigne < nbLignes) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[idLigne][j].activerCellule();
            }
        }
    }

    /**
     * Active toutes les cellules d'une colonne sp�cifique de la grille.
     *
     * @param idColonne L'identifiant de la colonne � activer. Doit �tre un
     * nombre valide entre 0 et (nbColonnes - 1).
     */
    public void activerColonneDeCellules(int idColonne) {
        if (idColonne >= 0 && idColonne < nbColonnes) {
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][idColonne].activerCellule();
            }
        }
    }

    /**
     * Active la diagonale descendante de la grille en partant du coin sup�rieur
     * gauche.
     */
    public void activerDiagonaleDescendante() {
        int minDim = Math.min(nbLignes, nbColonnes);

        for (int i = 0; i < minDim; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
     * Active la diagonale montante de la grille en partant du coin sup�rieur
     * droit.
     */
    public void activerDiagonaleMontante() {
        int minDim = Math.min(nbLignes, nbColonnes);

        for (int i = 0; i < minDim; i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
    }

    /**
     * V�rifie si toutes les cellules de la grille sont �teintes.
     *
     * @return `true` si toutes les cellules de la grille sont �teintes, `false`
     * sinon.
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].getEtat()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Cr�e une repr�sentation visuelle de l'�tat de la grille sous forme de
     * cha�ne de caract�res.
     *
     * @return Une cha�ne de caract�res repr�sentant l'�tat de la grille.
     */
    @Override
    public String toString() {
        StringBuilder grilleString = new StringBuilder();

        grilleString.append("  ");
        for (int j = 0; j < nbColonnes; j++) {
            grilleString.append(" " + j);
        }
        grilleString.append("\n");

        for (int i = 0; i < nbLignes; i++) {
            grilleString.append(i + " ");
            for (int j = 0; j < nbColonnes; j++) {
                grilleString.append(matriceCellules[i][j].getEtat() ? " X" : " O");
            }
            grilleString.append("\n");
        }

        return grilleString.toString();
    }


}
