package tp2_convertisseurobjet_helderal;

/* Helderal
*TP2
*TDA2
*apprendre à utiliser java
*26 septempbre 2023


package tp2_convertisseurobjet_helderal;

/**
 *
 * @author elisa
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur() {
        nbConversions=0;}
        
    public double CelciusVersKelvin (double tCelcius){
        nbConversions++;
    double tKelvin=273.15+tCelcius;
    return tKelvin; 
    
    } 
     public  double KelvinversCelcius (double tKelvin){
         nbConversions++;
    double tCelcius=tKelvin-273.15;
    return tCelcius;
     }
     public double FarenheitversCelcius (double tFarenheit){
         nbConversions++;
    double tCelcius=(tFarenheit-32)/1.8;
    return tCelcius;
     }
      public double CelciusversFarenheit (double tCelcius){
          nbConversions++;
    double tFarenheit=(tCelcius*1.8)+32;
    return tFarenheit;
     }
   public double KelvinversFarenheit (double tKelvin){
       nbConversions++;
    double tFarenheit=tKelvin*1.8-459.67;
    return tFarenheit;
   }
    public double FarenheitKelvin (double tFarenheit){
        nbConversions++;
    double tKelvin=(tFarenheit+459.67)/1.8;
    return tKelvin;
    }
@Override
public String toString () {
return "nb de conversions"+ nbConversions;
}
    }
    
            

