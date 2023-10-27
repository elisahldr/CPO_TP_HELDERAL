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
* Constructeur de la classe GrilleDeJeu.
*
* @param p_nbLignes    Le nombre de lignes de la grille.
* @param p_nbColonnes  Le nombre de colonnes de la grille.
*
* Ce constructeur cr�e une nouvelle grille de cellules lumineuses avec le nombre de lignes
* et de colonnes sp�cifi�. Il initialise toutes les cellules de la grille � l'�tat �teint.
* La grille est organis�e en lignes et colonnes, et chaque cellule est repr�sent�e par un objet
* de type CelluleLumineuse, qui est initialis� comme �teint.
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
*
* Cette m�thode parcourt toutes les cellules de la grille et les passe en �tat "�teint" en utilisant la m�thode
* "eteindreCellule" de la classe CelluleLumineuse. Apr�s l'ex�cution de cette m�thode, toutes les cellules de la grille
* seront �teintes.
*/
     public void eteindreToutesLesCellules() {
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[i][j].eteindreCellule();
        }
    }
}
  /**
* Active al�atoirement une ligne, une colonne ou une diagonale de cellules dans la grille.
*
* Cette m�thode utilise un g�n�rateur de nombres al�atoires pour choisir al�atoirement entre
* l'activation d'une ligne, d'une colonne ou d'une diagonale de cellules dans la grille.
* Apr�s avoir effectu� le choix, elle active les cellules correspondantes en utilisant la m�thode
* "activerCellule" de la classe CelluleLumineuse.
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
* G�n�re al�atoirement un plateau de cellules lumineuses en effectuant un nombre sp�cifi� de tours.
*
* Cette m�thode initialise d'abord toutes les cellules de la grille � l'�tat �teint en appelant la m�thode
* "eteindreToutesLesCellules". Ensuite, elle g�n�re un plateau de cellules lumineuses de mani�re al�atoire en effectuant
* un nombre sp�cifi� de tours. � chaque tour, elle utilise la m�thode "activerLigneColonneOuDiagonaleAleatoire" pour
* activer al�atoirement une ligne, une colonne ou une diagonale de cellules dans la grille. Cela permet de g�n�rer une
* grille avec un certain degr� d'al�atoire tout en garantissant qu'elle ait une solution r�alisable.
*
* @param nbTours Le nombre de tours � effectuer pour m�langer la grille.
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
* Cette m�thode active toutes les cellules d'une ligne sp�cifique de la grille en utilisant la m�thode
* "activerCellule" de la classe CelluleLumineuse. Elle v�rifie d'abord si l'identifiant de la ligne pass� en param�tre
* est valide, c'est-�-dire qu'il se situe dans la plage des lignes de la grille.
*
* @param idLigne L'identifiant de la ligne � activer. Doit �tre un nombre valide entre 0 et (nbLignes - 1).
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
* Cette m�thode active toutes les cellules d'une colonne sp�cifique de la grille en utilisant la m�thode
* "activerCellule" de la classe CelluleLumineuse. Elle v�rifie d'abord si l'identifiant de la colonne pass� en param�tre
* est valide, c'est-�-dire qu'il se situe dans la plage des colonnes de la grille.
*
* @param idColonne L'identifiant de la colonne � activer. Doit �tre un nombre valide entre 0 et (nbColonnes - 1).
*/
   public void activerColonneDeCellules(int idColonne) {
    if (idColonne >= 0 && idColonne < nbColonnes) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }
}
   /**
* Active la diagonale descendante de la grille.
*
* Cette m�thode active la diagonale descendante de la grille en utilisant la m�thode
* "activerCellule" de la classe CelluleLumineuse. Elle commence � la cellule situ�e en haut � gauche de la grille
* (coin sup�rieur gauche) et parcourt la diagonale en direction de la cellule situ�e en bas � droite de la grille.
* Elle s'arr�te lorsque la diagonale atteint la fin de la grille ou lorsque la grille n'est pas carr�e.
* Ainsi, seules les cellules de la diagonale descendante sont activ�es.
*/
  public void activerDiagonaleDescendante() {
    int minDim = Math.min(nbLignes, nbColonnes);

    for (int i = 0; i < minDim; i++) {
        matriceCellules[i][i].activerCellule();
    }
}
  /**
* Active la diagonale montante de la grille.
*
* Cette m�thode active la diagonale montante de la grille en utilisant la m�thode
* "activerCellule" de la classe CelluleLumineuse. Elle commence � la cellule situ�e en haut � droite de la grille
* (coin sup�rieur droit) et parcourt la diagonale en direction de la cellule situ�e en bas � gauche de la grille.
* Elle s'arr�te lorsque la diagonale atteint la fin de la grille ou lorsque la grille n'est pas carr�e.
* Ainsi, seules les cellules de la diagonale montante sont activ�es.
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
* Cette m�thode parcourt toutes les cellules de la grille et v�rifie si au moins une cellule est allum�e.
* Si au moins une cellule est allum�e, la m�thode retourne `false`. Sinon, si toutes les cellules sont �teintes,
* la m�thode retourne `true`.
*
* @return `true` si toutes les cellules de la grille sont �teintes, `false` sinon.
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
* Cr�e une repr�sentation visuelle de l'�tat de la grille sous forme de cha�ne de caract�res.
*
* Cette m�thode g�n�re une cha�ne de caract�res repr�sentant l'�tat de la grille de mani�re organis�e.
* Elle inclut les indices des lignes et des colonnes ainsi que des caract�res "X" pour les cellules allum�es
* et "O" pour les cellules �teintes. La cha�ne r�sultante repr�sente la grille dans un format lisible et est
* adapt�e � ses dimensions, quelles qu'elles soient.
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


