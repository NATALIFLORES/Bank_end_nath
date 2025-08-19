import java.util.Scanner;

public class Ativ_Valiativa {

	public static void main(String[] args) {
		double salarioAtual, valorAumento;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu salario: ");
		salarioAtual = ler.nextDouble();
		
		if(salarioAtual <= 1000){
			valorAumento = salarioAtual *(1 + 0.4);
			System.out.println("Seu salario vai ter um aumento 40%! \n Valor total: "+valorAumento);
		}else if(salarioAtual == 1000) {
			valorAumento = salarioAtual *(1 + 0.4);
			System.out.println("Seu salario vai ter um aumento de 40%!");
		}else if(salarioAtual >= 1000) {
			valorAumento = salarioAtual*(1+0.3);
			System.out.println("Seu salario vai ter um aumento de 30% \n Valor total: "+valorAumento);
		}
	}

}