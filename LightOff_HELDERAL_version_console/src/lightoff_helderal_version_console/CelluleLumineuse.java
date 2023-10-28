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
 * Constructeur par défaut de la classe CelluleLumineuse.
 * Crée une nouvelle instance de CelluleLumineuse avec un état initial éteint (false).
 */
    public CelluleLumineuse() {
       this.etat = false;
    }
    /**
 * Active ou désactive l'état de la cellule lumineuse.
 * Si la cellule est allumée, elle est éteinte, et si elle est éteinte, elle est allumée.
 */
    public void activerCellule() {
        if (this.etat == true) {
            this.etat = false;
        } else {
            this.etat = true;
        }
 
    }
 
    /**
 * Éteint la cellule lumineuse en mettant son état à "éteint" (false).
 */
    public void eteindreCellule() {
        this.etat=false;
    }
    
 /**
 * Vérifie si la cellule lumineuse est éteinte.
 *
 * @return true si la cellule est éteinte, sinon false.
 */
    public boolean estEteint() {
        if (this.etat == false) {
            return true;
        } else {
            return false;
 
        }
    }
 
    /**
 * Renvoie l'état actuel de la cellule lumineuse.
 *
 * @return true si la cellule est allumée, sinon false si elle est éteinte.
 */
    public boolean getEtat() {
        return etat;
    }
 
   /**
* Redéfinit la méthode toString pour afficher l'état de la cellule lumineuse de manière lisible
 * Si la cellule est allumée, elle affiche "X", et si la cellule est éteinte, elle affiche "O".
* @return Une chaîne de caractères représentant l'état de la cellule (X pour allumée, O pour éteinte).
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
