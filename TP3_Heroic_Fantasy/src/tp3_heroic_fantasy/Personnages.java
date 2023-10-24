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
    int nbPersos;

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
        nbPersos += 1;

    }

    public void finale() {
        nbPersos = nbPersos - 1;
    }

    public void fatigue() {
        niveauDeVie = niveauDeVie - 10;
    }

    public boolean enVie() {
        if (niveauDeVie > 0) {
            System.out.println(nom + " est toujours en vie");
            return true;
        } else {
            System.out.println(nom + " est décédé");
            return false;

        }
    }
    public void attaque (int points) {
        niveauDeVie=niveauDeVie-points;
    }

    @Override
    public String toString() {
        String chaine = nom + "Niveau de vie : " + niveauDeVie;
        return chaine;

    }

   
}
