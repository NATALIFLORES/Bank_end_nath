import java.util.Scanner;

public class Loop_266 {

	public static void main(String[] args) {
		String nome;
		char primeiroCaracter;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		nome = ler.next();
		
		while (true) {
			if (nome.equals("fim")) {
	                break;
	            }else {
	            	primeiroCaracter = nome.charAt(0);
	            	System.out.println(primeiroCaracter);
	            }
			 System.out.println("digite um nome: ");
			 nome= ler.next();
	        }
    }
}