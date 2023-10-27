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
public class CelluleLumineuse {

    private boolean etat;

    /**
     * cr�ation d'un nouvel objet , en lui attribuant un �tat initial sp�cifi�
     * par le param�tre etat.
     *
     * @param etat L'�tat initial de la cellule lumineuse. true pour allum�e et
     * false pour �teinte.
     */
    public CelluleLumineuse(boolean etat) {
       this.etat = false;
    }

    CelluleLumineuse() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




    /**
     *
     * Inverse l'�tat de la cellule lumineuse. Si la cellule est actuellement
     * allum�e, elle sera �teinte, et vice versa.
     */
    public void activerCellule() {
        if (etat == true) {
            etat = false;
        } else {
            etat = true;
        }

    }

    /**
     * �teint la cellule lumineuse si elle est actuellement allum�e.
     */
    public void eteindreCellule() {
        if (etat == true) {
            etat = false;
        }
    }

    /**
     * Verifie si la celluleLumineuse est etiente
     *
     * @param cellule L'objet CelluleLumineuse � v�rifier.
     * @return renvoie true si la cellule est �teinte, sinon false.
     */
    public boolean estEteint(boolean cellule) {
        if (cellule == false) {
            return true;
        } else {
            return false;

        }
    }

    /**
     * Obtient l'�tat de la cellule lumineuse.
     *
     * @return true si la cellule est allum�e, sinon false.
     */
    public boolean getEtat(boolean cellule) {
        if (cellule = true) {
            return true;
        } else {
            return false;
        }
    }

   /**
 * Red�finit la m�thode toString pour afficher l'�tat de la cellule lumineuse de mani�re lisible 
 * Si la cellule est allum�e, elle affiche "X", et si la cellule est �teinte, elle affiche "O".
 * @return Une cha�ne de caract�res repr�sentant l'�tat de la cellule (X pour allum�e, O pour �teinte).
 */
    @Override
    public String toString() {
       return etat ? "X" : "O";
    }

    boolean estEteint() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean getEtat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
