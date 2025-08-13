import java.util.Scanner;

public class Algoritmo_48 {
    public static void main(String[] args) {
        int q;  // quantidade de watts
        double valor100kw, valorPorKw, valorTotal, valorComDesconto;
        double salario;

        Scanner ler = new Scanner(System.in);

        System.out.print("Seu salário: ");
        salario = ler.nextDouble();

        System.out.print("Quantidade de quilowatts consumida: ");
        q = ler.nextInt();

        valor100kw = salario / 7.0; // 100 kW custa 1/7 do salário
        valorPorKw = valor100kw / 100.0; // valor de 1 kW
        valorTotal = valorPorKw * q; // valor sem desconto
        valorComDesconto = valorTotal * 0.9; // valor com 10% de desconto

        // Saída
        System.out.println("Valor em reais de cada quilowatt: R$" + valorPorKw);
        System.out.println("Valor a ser pago: R$" + valorTotal);
        System.out.println("Com Desconto de 10%: R$" + valorComDesconto);
    }
}
