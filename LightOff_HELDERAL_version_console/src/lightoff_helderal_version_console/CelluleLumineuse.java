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
 * Constructeur par d�faut de la classe CelluleLumineuse.
 * Cr�e une nouvelle instance de CelluleLumineuse avec un �tat initial �teint (false).
 */
    public CelluleLumineuse() {
       this.etat = false;
    }
    /**
 * Active ou d�sactive l'�tat de la cellule lumineuse.
 * Si la cellule est allum�e, elle est �teinte, et si elle est �teinte, elle est allum�e.
 */
    public void activerCellule() {
        if (this.etat == true) {
            this.etat = false;
        } else {
            this.etat = true;
        }
 
    }
 
    /**
 * �teint la cellule lumineuse en mettant son �tat � "�teint" (false).
 */
    public void eteindreCellule() {
        this.etat=false;
    }
    
 /**
 * V�rifie si la cellule lumineuse est �teinte.
 *
 * @return true si la cellule est �teinte, sinon false.
 */
    public boolean estEteint() {
        if (this.etat == false) {
            return true;
        } else {
            return false;
 
        }
    }
 
    /**
 * Renvoie l'�tat actuel de la cellule lumineuse.
 *
 * @return true si la cellule est allum�e, sinon false si elle est �teinte.
 */
    public boolean getEtat() {
        return etat;
    }
 
   /**
* Red�finit la m�thode toString pour afficher l'�tat de la cellule lumineuse de mani�re lisible
 * Si la cellule est allum�e, elle affiche "X", et si la cellule est �teinte, elle affiche "O".
* @return Une cha�ne de caract�res repr�sentant l'�tat de la cellule (X pour allum�e, O pour �teinte).
*/
    @Override
    public String toString() {
        if (etat== true){
            return "X";
        } else if (etat == false){
        
        return "O";
        }
        return null;
    }
    }
 
 
   

 
 1
