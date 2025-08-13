
import java.util.Scanner;

public class Algoritmo_43 {
    public static void main(String[] args) {
        double num,logBase10;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
         num = ler.nextDouble();
        
         logBase10 = Math.log10(num);
        
        System.out.println("Logaritmo base 10: " + logBase10);
    }
}