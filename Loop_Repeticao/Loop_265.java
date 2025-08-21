
import java.uitl.Scanner;

public class Loop_265 {

	public static void main(String[] args) {
		double numero, soma =0;
		int acm = 0;
		Scanner ler =new Scanner(System.in);
		
		System.out.println("Digite numero entre 100 ao 200:");
		numero = ler.nextDouble();
		
		while(true) {
			if(numero >=100 && numero<=200) {
				soma = soma + numero;
				acm = acm + 1;
			}else if(numero == 0) {
				break;
			}
			System.out.println("para exectar digite 0 \nDigite numero entre 100 ao 200:");
			numero = ler.nextDouble();
		}
		System.out.println("total de numero digite: "+acm);
	}

}
