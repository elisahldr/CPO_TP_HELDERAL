package tp1_convertisseur_helderal;

import java.util.Scanner;

/* Helderal
*TP1
*TDA2
*apprendre à utiliser java
*26 septempbre 2023
package tp1_convertisseur_helderal;

/**
 *
 * @author elisa
 */
public class TP1_convertisseur_HELDERAL {

    private static boolean Saisissez;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
System.out.println("Bonjour, saisissez une temperature a convertir:");
double variable1=sc.nextDouble();
System.out.println("Temperature saisie: "+variable1);
System.out.println("Saisissez la conersion souaitee \n 1-Celcius vers Kelvin \n 2-Kelvin vers Celcius \n 3-Farenheit vers Celcius \n 4-Celcius vers Farenheit \n 5-Kelvin vers Farenheit \n 6- Farenheit vers Celcius ");

int saisiemenu=sc.nextInt();
if (saisiemenu==1){
    double a=CelciusVersKelvin(variable1);
    System.out.println(a+"K");
}if (saisiemenu==2){
    double b=KelvinversCelcius(variable1);
    System.out.println(b+"C");
}if (saisiemenu==3){
    double c=FarenheitversCelcius(variable1);
    System.out.println(c+"C");
}if (saisiemenu==4){
    double d=CelciusversFarenheit(variable1);
    System.out.println(d+"F");
}if (saisiemenu==5){
    double e=KelvinversFarenheit(variable1);
    System.out.println(e+"F");
}if (saisiemenu==6){
    double f=FarenheitKelvin(variable1);
    System.out.println(f+"K");
}

    
}

    public static double CelciusVersKelvin (double tCelcius){
    double tKelvin=273.15+tCelcius;
    return tKelvin; 
    
    
    } 
     public static double KelvinversCelcius (double tKelvin){
    double tCelcius=tKelvin-273.15;
    return tCelcius;
     }
     public static double FarenheitversCelcius (double tFarenheit){
    double tCelcius=(tFarenheit-32)/1.8;
    return tCelcius;
     }
      public static double CelciusversFarenheit (double tCelcius){
    double tFarenheit=(tCelcius*1.8)+32;
    return tFarenheit;
     }
   public static double KelvinversFarenheit (double tKelvin){
    double tFarenheit=tKelvin*1.8-459.67;
    return tFarenheit;
   }
    public static double FarenheitKelvin (double tFarenheit){
    double tKelvin=(tFarenheit+459.67)/1.8;
    return tFarenheit;
    }
}
   
     
    
