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
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;
    
   /**
* Constructeur de la classe GrilleDeJeu.
*
* @param p_nbLignes    Le nombre de lignes de la grille.
* @param p_nbColonnes  Le nombre de colonnes de la grille.
*
* Ce constructeur crée une nouvelle grille de cellules lumineuses avec le nombre de lignes
* et de colonnes spécifié. Il initialise toutes les cellules de la grille à l'état éteint.
* La grille est organisée en lignes et colonnes, et chaque cellule est représentée par un objet
* de type CelluleLumineuse, qui est initialisé comme éteint.
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
* Éteint toutes les cellules de la grille.
*
* Cette méthode parcourt toutes les cellules de la grille et les passe en état "éteint" en utilisant la méthode
* "eteindreCellule" de la classe CelluleLumineuse. Après l'exécution de cette méthode, toutes les cellules de la grille
* seront éteintes.
*/
     public void eteindreToutesLesCellules() {
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[i][j].eteindreCellule();
        }
    }
}
  /**
* Active aléatoirement une ligne, une colonne ou une diagonale de cellules dans la grille.
*
* Cette méthode utilise un générateur de nombres aléatoires pour choisir aléatoirement entre
* l'activation d'une ligne, d'une colonne ou d'une diagonale de cellules dans la grille.
* Après avoir effectué le choix, elle active les cellules correspondantes en utilisant la méthode
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
* Génère aléatoirement un plateau de cellules lumineuses en effectuant un nombre spécifié de tours.
*
* Cette méthode initialise d'abord toutes les cellules de la grille à l'état éteint en appelant la méthode
* "eteindreToutesLesCellules". Ensuite, elle génère un plateau de cellules lumineuses de manière aléatoire en effectuant
* un nombre spécifié de tours. À chaque tour, elle utilise la méthode "activerLigneColonneOuDiagonaleAleatoire" pour
* activer aléatoirement une ligne, une colonne ou une diagonale de cellules dans la grille. Cela permet de générer une
* grille avec un certain degré d'aléatoire tout en garantissant qu'elle ait une solution réalisable.
*
* @param nbTours Le nombre de tours à effectuer pour mélanger la grille.
*/
    public void melangerMatriceAleatoirement(int nbTours) {
    eteindreToutesLesCellules(); // Éteindre toutes les cellules au début

    Random random = new Random();

    for (int tour = 0; tour < nbTours; tour++) {
        activerLigneColonneOuDiagonaleAleatoire();
    }
}
  /**
* Active toutes les cellules d'une ligne spécifique de la grille.
*
* Cette méthode active toutes les cellules d'une ligne spécifique de la grille en utilisant la méthode
* "activerCellule" de la classe CelluleLumineuse. Elle vérifie d'abord si l'identifiant de la ligne passé en paramètre
* est valide, c'est-à-dire qu'il se situe dans la plage des lignes de la grille.
*
* @param idLigne L'identifiant de la ligne à activer. Doit être un nombre valide entre 0 et (nbLignes - 1).
*/
  public void activerLigneDeCellules(int idLigne) {
    if (idLigne >= 0 && idLigne < nbLignes) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }
} 
  /**
* Active toutes les cellules d'une colonne spécifique de la grille.
*
* Cette méthode active toutes les cellules d'une colonne spécifique de la grille en utilisant la méthode
* "activerCellule" de la classe CelluleLumineuse. Elle vérifie d'abord si l'identifiant de la colonne passé en paramètre
* est valide, c'est-à-dire qu'il se situe dans la plage des colonnes de la grille.
*
* @param idColonne L'identifiant de la colonne à activer. Doit être un nombre valide entre 0 et (nbColonnes - 1).
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
* Cette méthode active la diagonale descendante de la grille en utilisant la méthode
* "activerCellule" de la classe CelluleLumineuse. Elle commence à la cellule située en haut à gauche de la grille
* (coin supérieur gauche) et parcourt la diagonale en direction de la cellule située en bas à droite de la grille.
* Elle s'arrête lorsque la diagonale atteint la fin de la grille ou lorsque la grille n'est pas carrée.
* Ainsi, seules les cellules de la diagonale descendante sont activées.
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
* Cette méthode active la diagonale montante de la grille en utilisant la méthode
* "activerCellule" de la classe CelluleLumineuse. Elle commence à la cellule située en haut à droite de la grille
* (coin supérieur droit) et parcourt la diagonale en direction de la cellule située en bas à gauche de la grille.
* Elle s'arrête lorsque la diagonale atteint la fin de la grille ou lorsque la grille n'est pas carrée.
* Ainsi, seules les cellules de la diagonale montante sont activées.
*/
  public void activerDiagonaleMontante() {
    int minDim = Math.min(nbLignes, nbColonnes);

    for (int i = 0; i < minDim; i++) {
        matriceCellules[i][nbColonnes - 1 - i].activerCellule();
    }
}
  /**
* Vérifie si toutes les cellules de la grille sont éteintes.
*
* Cette méthode parcourt toutes les cellules de la grille et vérifie si au moins une cellule est allumée.
* Si au moins une cellule est allumée, la méthode retourne `false`. Sinon, si toutes les cellules sont éteintes,
* la méthode retourne `true`.
*
* @return `true` si toutes les cellules de la grille sont éteintes, `false` sinon.
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
* Crée une représentation visuelle de l'état de la grille sous forme de chaîne de caractères.
*
* Cette méthode génère une chaîne de caractères représentant l'état de la grille de manière organisée.
* Elle inclut les indices des lignes et des colonnes ainsi que des caractères "X" pour les cellules allumées
* et "O" pour les cellules éteintes. La chaîne résultante représente la grille dans un format lisible et est
* adaptée à ses dimensions, quelles qu'elles soient.
*
* @return Une chaîne de caractères représentant l'état de la grille.
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


