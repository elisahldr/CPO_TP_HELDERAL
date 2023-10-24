/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy;

import Armes.Arme;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author elisa
 */
public abstract class Personnages {

    String nom;
    int niveauDeVie = 100;
    String armesPortees = null;

    ArrayList<Arme> armesPossedees = new ArrayList<>();

    public boolean ajouterUneArme(Arme armeAjouter) {
        if (this.armesPossedees.size() == 5) {
            return false;
        } else {
            this.armesPossedees.add(armeAjouter);
            return true;
        }
    }

    public void Arme_en_Main() {
        System.out.println("Quelle armes voulez-vous? \n");
        for (int i = 0; i < this.armesPossedees.size(); i++) {
            System.out.println("(" + i + ") " + this.armesPossedees.get(i));
        }
    }

    public Personnages(String Nom, int NiveauDeVie) {
        nom = Nom;
        niveauDeVie = NiveauDeVie;

    }

    @Override
    public String toString() {
        String chaine = nom + "Niveau de vie : " + niveauDeVie;
        return chaine;

    }

}
