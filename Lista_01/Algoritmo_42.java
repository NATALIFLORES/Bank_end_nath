
import java.util.Scanner;

public class Algoritmo_42{
    public static void main(String[] args){
        double graus,rad;
        double seno,coseno,tangente;
        double secante, cosecante, cotangente;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o Ângulo em graus:");
        graus = ler.nextDouble();

        rad = Math.toRadians(graus);

        seno = Math.sin(rad);
         coseno = Math.cos(rad);
         tangente = Math.tan(rad);
         secante = 1 / coseno;
         cosecante = 1 / seno;
         cotangente = 1 / tangente;

        System.out.println("Seno: " +seno+
        "Coseno: " + coseno
        +"Tangente: " + tangente+
        "Secante: " + secante+
        "Co-secante: " + cosecante+
        "Co-tangente: " + cotangente);
        
    }
}