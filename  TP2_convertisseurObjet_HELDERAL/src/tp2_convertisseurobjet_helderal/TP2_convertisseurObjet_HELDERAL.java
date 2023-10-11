package tp2_convertisseurobjet_helderal;

import java.util.Scanner;

/* Helderal
*2
*TDA2
*apprendre à utiliser java
*26 septempbre 2023
package tp1_convertisseurObjet_helderal;


/**
 *
 * @author elisa
 */
public class TP2_convertisseurObjet_HELDERAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur Objet1 = new Convertisseur();
        Objet1.CelciusVersKelvin(21);
        Objet1.CelciusversFarenheit(25);
        Objet1.KelvinversCelcius(291);
        System.out.println("Vous avez effectue " + Objet1.nbConversions + " conversions");

        Convertisseur Objet2 = new Convertisseur();
        Objet2.FarenheitKelvin( 120);
        Objet2.FarenheitversCelcius(92);
        Objet2.KelvinversFarenheit(293);
        System.out.println("Vous avez effectue " + Objet2.nbConversions + " conversions");
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Bonjour, saisissez une temperature a convertir:");
double variable1=sc.nextDouble();
System.out.println("Temperature saisie: "+variable1);
System.out.println("Saisissez la conersion souaitee \n 1-Celcius vers Kelvin \n 2-Kelvin vers Celcius \n 3-Farenheit vers Celcius \n 4-Celcius vers Farenheit \n 5-Kelvin vers Farenheit \n 6- Farenheit vers Celcius ");

int saisiemenu=sc.nextInt();
if (saisiemenu==1){
    double a=Objet1.CelciusVersKelvin(variable1);
    System.out.println(a+"K");
}if (saisiemenu==2){
    double b=Objet1.KelvinversCelcius(variable1);
    System.out.println(b+"C");
}if (saisiemenu==3){
    double c=Objet2.FarenheitversCelcius(variable1);
    System.out.println(c+"C");
}if (saisiemenu==4){
    double d=Objet1.CelciusversFarenheit(variable1);
    System.out.println(d+"F");
}if (saisiemenu==5){
    double e=Objet2.KelvinversFarenheit(variable1);
    System.out.println(e+"F");
}if (saisiemenu==6){
    double f=Objet2.FarenheitKelvin(variable1);
    System.out.println(f+"K");
}

    }

}
