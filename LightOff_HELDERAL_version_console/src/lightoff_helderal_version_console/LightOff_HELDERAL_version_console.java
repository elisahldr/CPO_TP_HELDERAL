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
public class LightOff_HELDERAL_version_console {

   
    public static void main(String[] args) {
  
        CelluleLumineuse cellule1 = new CelluleLumineuse(true);
          cellule1.activerCellule();
        System.out.println("État initial de cellule1 : " + cellule1);


        cellule1.eteindreCellule();
        System.out.println("Nouvel état de cellule1 : " + cellule1);

 
        CelluleLumineuse cellule2 = new CelluleLumineuse(false);
        System.out.println("État initial de cellule2 : " + cellule2);
        
    
        cellule2.activerCellule();
        System.out.println("Nouvel état de cellule2 : " + cellule2);

       
        boolean estEteinte = cellule2.estEteint();
        System.out.println("La cellule2 est éteinte : " + estEteinte);


        boolean etatCellule1 = cellule1.getEtat();
        System.out.println("État de cellule1 : " + etatCellule1);
    }
}


        
