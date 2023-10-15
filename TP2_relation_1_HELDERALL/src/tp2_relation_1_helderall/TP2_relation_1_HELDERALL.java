/* Helderal
*TP2
*TDA2
*apprendre à utiliser java
*8 octobre 2023
 */
package tp2_relation_1_helderall;

/**
 *
 * @author elisa
 */
public class TP2_relation_1_HELDERALL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        System.out.println("liste des voitures disponibles " + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);
        
        bob.liste_voitures[0] = uneClio;
        bob.liste_voitures[1] = uneMicra;
        bob.nbVoitures = 2;
        uneClio.Proprietaire = bob;
        uneMicra.Proprietaire = bob;
        System.out.println("la premiere voiture de Bob est une "
                + bob.liste_voitures[0]);
        System.out.println("la seconde voiture de Bob est une "
                + bob.liste_voitures[1]);

        reno.liste_voitures[0] = une2008;
        reno.liste_voitures[1] = uneAutreClio;
        reno.nbVoitures = 2;
        une2008.Proprietaire = reno;
        uneAutreClio.Proprietaire = reno;
        System.out.println("la premiere voiture de Reno est une "
                + bob.liste_voitures[0]);
        System.out.println("la seconde voiture de Reno est une "
                + reno.liste_voitures[1]);

    }

}
