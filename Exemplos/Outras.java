import java.util.Scanner;

public class outra {

	public static void main(String[] args) {
		double tabuada2 = 2;
		double num;
		double multiplicacao;

		Scanner ler = new Scanner(System.in);
		System.out.println("numero :");
		num= ler.nextDouble();
		multiplicacao = tabuada2 * num;
		System.out.println(tabuada2+" x "+num+"="+multiplicacao);
	}

}