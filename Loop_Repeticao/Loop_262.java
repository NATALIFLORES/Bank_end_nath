import java.util.Scanner;

public class Loop_262 {

	public static void main(String[] args) {
		int numero, total;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 0 para iniciar");
		numero = ler.nextInt();
		
		while(true) {
			if(numero >=0) {
				System.out.println("Digite um numero");
				numero = ler.nextInt();
				total = numero *3;
				System.out.println(total);
			}else {
				System.out.println("Fim");
				break;
			}
		}
	}
}