import java.util.Scanner;
public class Algoritmo_53 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Lado a: ");
        double a = ler.nextDouble();
        System.out.print("Lado b: ");
        double b = ler.nextDouble();
        System.out.print("Lado c: ");
        double c = ler.nextDouble();

        double diagonal = Math.sqrt(a * a + b * b + c * c);
        System.out.println("Diagonal: " + diagonal);
    }
}
