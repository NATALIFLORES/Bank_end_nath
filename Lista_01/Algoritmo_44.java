
import java.util.Scanner;

public class Algoritmo_44 {
    public static void main(String[] args) {
        double num;
        double base,logBase;

        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o número: ");
        num = ler.nextDouble();
        System.out.print("Digite a base: ");
        base = ler.nextDouble();
        
        logBase = Math.log(num) / Math.log(base);
        
        System.out.println("Logaritmo base " + base + ": " + logBase);
    }
}