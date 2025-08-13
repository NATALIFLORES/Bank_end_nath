import java.util.Scanner;

public class Input_01 {
	
	    public static void main(String [] args){
	        int num01;
	        int num02;
	        int soma;

	        Scanner ler = new Scanner(System.in);
	        System.out.println("Digite um numero: ");
	        num01 = ler.nextInt();

	        System.out.println("Digite um numero: ");
	        num02 = ler.nextInt();

	        soma = num01 + num02;

	        System.out.println("Total: "+soma);
	        
	    }
	}