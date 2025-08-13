import java.util.Scanner;
public class Algoritmo_55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Diagonal maior: ");
        double D = input.nextDouble();
        System.out.print("Diagonal menor: ");
        double d = input.nextDouble();

        double area = (D * d) / 2;
        System.out.println("Área do losango: " + area);
    }
}
