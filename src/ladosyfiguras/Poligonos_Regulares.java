package ladosyfiguras;
import java.util.*;
import javax.swing.JOptionPane;

public class Poligonos_Regulares {
    
    public double perimetro(int lados, double longitud){
         double p = lados * longitud;
        return p;
    }
    
        public double area(int lados, double longitud){
            double area = 0;
            if(lados >= 5){
            double p = lados * longitud;
            double pitagoras = (longitud*longitud) - (longitud/2 * longitud/2);
            double apo =  Math.sqrt(pitagoras);
             area = (p * apo)/2;
            }else if(lados == 4){
                area = longitud * longitud;
            }else if(lados == 3){
                area = 0.4330 * (longitud*longitud);
            }else{
                 JOptionPane.showMessageDialog(null, "No soporto esos numeros :(", "Alerta", JOptionPane.WARNING_MESSAGE);
                 return 0;
            }
        return area;
    }
    
        public String nombre(int L){
            String resultado = "";
            String ult = "GONO";
            String conj = "KAI";
            String alfa[] = {"","HENA","DI", "TRI","TETRA","PENTA","HEXA","HEPTA", "OCTA", "ENEA"};
            String beta[] = {"DECA", "ICOSA", "TRICONTA", "TETRACONTA", "PENTACONTA", "HEXACONTA", "HEPTACONTA", "ENEACONTA"};
            String gamma[] = {"HECTA", "CHILIA", "MIRIA", "HECTAMIRIA"};
            if(L < 2){
                resultado = "No existe.";
            }else if(L == 3){
                resultado = "Triangulo";
            }else if(L == 4){
                resultado = "Cuadrado";
            }else if(L >= 5){
                resultado = alfa[L]+ult;
            }else{
                resultado = "No existe.";
            }
        return resultado;
        }
}
