
import java.util.Scanner;

public class Algoritmo_46 {
    public static void main(String[] args) {
        double saldo,novoSaldo;

        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o saldo da aplicação: ");
        saldo = ler.nextDouble();
        
        novoSaldo = saldo * 1.01;
        
        System.out.println("Novo saldo: " + novoSaldo);
    }
}