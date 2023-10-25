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
public class GrilleDeJeu {

    private final CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

   /**
 * Constructeur de la grille de cellules lumineuses.
 *
 * @param lignes    Le nombre de lignes de la grille.
 * @param colonnes  Le nombre de colonnes de la grille.
 */
    public GrilleDeJeu(int lignes, int colonnes) {
        matriceCellules = new CelluleLumineuse[lignes][colonnes];
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse(false);
            }
        }
    } 


    
}
