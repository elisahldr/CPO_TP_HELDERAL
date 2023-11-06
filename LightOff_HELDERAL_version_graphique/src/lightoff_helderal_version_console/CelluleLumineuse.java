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
public class CelluleLumineuse {

    private boolean etat;

    /**
     * Crée une nouvelle instance de CelluleLumineuse avec un état initial
     * éteint (false)
     */
    public CelluleLumineuse() {
        this.etat = false;
    }

    /**
     * Si la cellule est allumée, elle est éteinte, et si elle est éteinte, elle
     * est allumée
     */
    public void activerCellule() {
        if (this.etat == true) {
            this.etat = false;
        } else {
            this.etat = true;
        }

    }

    /**
     * Éteint la cellule lumineuse en mettant son état à "éteint" (false)
     */
    public void eteindreCellule() {
        this.etat = false;
    }

    /**
     * Vérifie si la cellule lumineuse est éteinte
     *
     * @return true si la cellule est éteinte, sinon false
     */
    public boolean estEteint() {
        if (this.etat == false) {
            return true;
        } else {
            return false;

        }
    }

    /**
     * Renvoie l'état actuel de la cellule lumineuse
     *
     * @return true si la cellule est allumée, sinon false si elle est éteinte.
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     * Crée une représentation visuelle de l'état de la cellule sous forme de
     * chaîne de caractères.
     *
     * @return Une chaîne de caractères représentant l'état de la cellule ("X"
     * si allumée, "O" si éteinte).
     */
    @Override
    public String toString() {
        if (etat == true) {
            return "X";
        } else if (etat == false) {

            return "O";
        }
        return null;
    }
}
