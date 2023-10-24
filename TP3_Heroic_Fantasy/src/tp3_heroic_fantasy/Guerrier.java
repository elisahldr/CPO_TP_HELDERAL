/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy;

import Armes.Arme;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author elisa
 */
public class Guerrier extends Personnages {

    boolean cheval;
    String verif;
    ArrayList<Arme> TableauArmes = new ArrayList<Arme>();
    Arme armeMain;
    int nbGuerriers;

    public boolean ajoutArme(Arme ajoutArme) {
        if (TableauArmes.size() == 5) {
            System.out.print("Il y a trop d'armes");
            return false;
        } else {
            TableauArmes.add(ajoutArme);
            return true;
        }

    }

    public void choixDeArme(Arme arme) {
        if (TableauArmes.contains(arme)) {
            armeMain = arme;
        } else {
            System.out.println("Arme non disponible");
        }

    }

    public Guerrier(String nom, int niveauDeVie, boolean c) {
        super(nom, niveauDeVie);
        cheval = c;
        nbGuerriers += 1;
        armeMain = null;

        if (cheval == true) {
            verif = "est a cheval";
        } else {
            verif = "n'est pas a cheval";
        }
    }

    public Arme getArmeMain() {
        return armeMain;
    }

    public String equiperArme(Arme arme) {
        if (TableauArmes.contains(arme)) {
            armeMain = arme;
            return nom + "est equipe avec " + armeMain;

        } else {
            return nom + "n'a pas d'arme";
        }
    }

    public void finaleze() {
        nbGuerriers = nbGuerriers - 1;
    }
    public void attaquer (Personnages persos) {
        int pv=20;
         if (armeMain instanceof Epee){
           pv=20*((Epee)armeMain).IndiceFinesse;
            fatique();
        }
        if (cheval==true) {
            pv=pv/2;
        }
        persos.attaque(pv);
         System.out.println(persos + " est attaque par "+nom);
        
    }

    public String tostring() {
        return "Nom arme : " + nom + "\n Niveau de vie : " + niveauDeVie + " a cheval? : " + cheval;
    }

    private void fatique() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
