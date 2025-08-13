import java.util.Scanner;
public class Algoritmo_52 {
    public static void main(String[] args) {
        double lado,perimetro,area,diagonal;
        
        Scanner ler = new Scanner(System.in);
        System.out.print("Lado do quadrado: ");
        lado = ler.nextDouble();

        perimetro = 4 * lado;
        area = lado * lado;
        diagonal = lado * Math.sqrt(2);

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
        System.out.println("Diagonal: " + diagonal);
    }
}
