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
public class LightOff_HELDERAL_version_console {

   
    public static void main(String[] args) {
  
        CelluleLumineuse cellule1 = new CelluleLumineuse(true);
          cellule1.activerCellule();
        System.out.println("�tat initial de cellule1 : " + cellule1);


        cellule1.eteindreCellule();
        System.out.println("Nouvel �tat de cellule1 : " + cellule1);

 
        CelluleLumineuse cellule2 = new CelluleLumineuse(false);
        System.out.println("�tat initial de cellule2 : " + cellule2);
        
    
        cellule2.activerCellule();
        System.out.println("Nouvel �tat de cellule2 : " + cellule2);

       
        boolean estEteinte = cellule2.estEteint();
        System.out.println("La cellule2 est �teinte : " + estEteinte);


        boolean etatCellule1 = cellule1.getEtat();
        System.out.println("�tat de cellule1 : " + etatCellule1);
    }
}


        
