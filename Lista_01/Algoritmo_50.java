import java.util.Scanner;
public class Algoritmo_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Base: ");
        double base = input.nextDouble();
        System.out.print("Altura: ");
        double altura = input.nextDouble();

        double perimetro = 2 * (base + altura);
        double area = base * altura;
        double diagonal = Math.sqrt(base * base + altura * altura);

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
        System.out.println("Diagonal: " + diagonal);
    }
}
