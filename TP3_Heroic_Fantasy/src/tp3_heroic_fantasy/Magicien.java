/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy;

import Armes.Arme;
import Armes.Baton;
import java.util.ArrayList;

/**
 *
 * @author elisa
 */
public class Magicien extends Personnages {

    boolean confirme;
    String verif;
    ArrayList<Arme> TableauArmes = new ArrayList<Arme>();
    Arme armeMain;
    int nbMagiciens;

    public Magicien(String nom, int niveauDeVie, boolean conf) {
        super(nom, niveauDeVie);
        confirme = conf;
        nbMagiciens += 1;
        armeMain = null;

        if (confirme == true) {
            verif = "est confirme";
        } else {
            verif = "novice";
        }
    }

    public boolean ajoutArme(Arme ajoutArme) {
        if (TableauArmes.size() == 5) {
            System.out.print("Il y a trop d'armes");
            return false;
        } else {
            TableauArmes.add(ajoutArme);
            return true;

        }
    }

    public void ChoixDeArme(Arme arme) {
        if (TableauArmes.contains(arme)) {
            armeMain = arme;
        } else {
            System.out.println("Arme non disponible");

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
    public void attaquer (Personnages persos) {
        int pv=20;
         if (armeMain instanceof Baton){
           pv=20*((Baton)armeMain).AgeBaton;
            fatigue();
        }
        if (confirme==true) {
            pv=pv/2;
        }
        persos.attaque(pv);
         System.out.println(persos + " est attaque par "+nom);

    }

    public String tostring() {
        return "Nom arme : " + nom + "\n Niveau de vie : " + niveauDeVie + " Confirme?: " + confirme;

    }
}
