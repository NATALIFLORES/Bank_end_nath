import java.util.Scanner;

public class loop_263 {

	public static void main(String[] args) {
		int numero ,acm =0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um  numero positivo");
		numero =ler.nextInt();
		
		while (true) {
			if(numero >=0) {
				acm = acm +10;
			}else {
				break;
			}
		System.out.println("digite um numero positivo");
		numero = ler.nextInt();
		}
		System.out.println("total de numeros digitados: "+acm);
	}

}