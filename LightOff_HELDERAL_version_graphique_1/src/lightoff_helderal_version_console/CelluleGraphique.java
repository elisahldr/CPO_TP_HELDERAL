/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_helderal_version_console;

import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author elisa
 */
public class CelluleGraphique extends JButton {
    CelluleLumineuse celluleLumineuseAssociee;
    int largeur; 
    int longueur;

    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssoci�e, int largeur, int longueur) {
        this.celluleLumineuseAssociee = celluleLumineuseAssoci�e;
        this.largeur = largeur;
        this.longueur = longueur;

    }
    @Override
protected void paintComponent(Graphics g) {
super.paintComponent(g);
this.setText(celluleLumineuseAssociee.toString());
}
}
