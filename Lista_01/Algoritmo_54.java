import java.util.Scanner;
public class Algoritmo_54 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Base: ");
        double base = ler.nextDouble();
        System.out.print("Altura: ");
        double altura = ler.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("Área do triângulo: " + area);
    }
}
