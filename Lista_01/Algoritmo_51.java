
import java.util.Scanner;

public class Algoritmo_51 {
    public static void main(String[] args) {
        double r, perimetro, area;
        
        Scanner ler = new Scanner(System.in);
        System.out.print("Raio: ");
        r = ler.nextDouble();

        perimetro = 2 * Math.PI * r;
        area = Math.PI * r * r;

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
        }
    }
