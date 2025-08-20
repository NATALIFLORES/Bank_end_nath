import java.util.Scanner;
// ESTA TA EM FORMATO DE IMPORTAÇÃO
public class Atividade02 {
//esta e uma atividade de do dia 20/08
	public static void main(String[] args) {
		final double nivel1 = 51.50, nivel2 = 65.00, nivel3 = 80.00, nivel4 = 100.00;
		double desconto, dia;
		String op;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Sua mensalidade da escola da escola do tio Sam:"
		+"\nNível 1 = R$ 51,50 \nNível 2 = R$ 65,00 \nNível 3 = R$ 80,00 \nNível 4 = R$ 100,00 ");
		op = ler.nextLine();
		System.out.println("que dia de pagamento: ");
		dia = ler.nextInt();
		switch (op) {
		case "Nível 1":
			if(dia == 1 ) {
				desconto = nivel1 - (nivel1 * 0.15);
				System.out.println("com desconto de 15% : R$"+desconto);
			}else if(dia >1 && dia<= 5) {
				desconto = nivel1 - (nivel1 * 0.10);
				System.out.println("com desconto de 10% : R$"+desconto);
			}else if(dia >5 && dia <=10) {
				desconto = nivel1 - (nivel1 * 0.0389);
				System.out.println("com desconto de 3,89% : R$"+desconto);
			}else {
				System.out.println("sem desconto \nValor a pagar : R$"+nivel1);
			}
		break;
		case "Nível 2":
			if(dia == 1 ) {
				desconto = nivel2 - (nivel2 * 0.15);
				System.out.println("com desconto de 15% : R$"+desconto);
			}else if(dia >1 && dia<= 5) {
				desconto = nivel2 - (nivel2 * 0.10);
				System.out.println("com desconto de 10% : R$"+desconto);
			}else if(dia >5 && dia <=10) {
				desconto = nivel2 - (nivel2 * 0.0389);
				System.out.println("com desconto de 3,89% : R$"+desconto);
			}else {
				System.out.println("sem desconto \nValor a pagar : R$"+nivel2);
			}
		break;
		case "Nível 3":
			if(dia == 1 ) {
				desconto = nivel3 - (nivel3 * 0.15);
				System.out.println("com desconto de 15% : R$"+desconto);
			}else if(dia >1 && dia<= 5) {
				desconto = nivel3 - (nivel3 * 0.10);
				System.out.println("com desconto de 10% : R$"+desconto);
			}else if(dia >5 && dia <=10) {
				desconto = nivel3 - (nivel3 * 0.0389);
				System.out.println("com desconto de 3,89% : R$"+desconto);
			}else {
				System.out.println("sem desconto \nValor a pagar : R$"+nivel3);
			}
		break;
		case "Nível 4":
			if(dia == 1 ) {
				desconto = nivel4 - (nivel4 * 0.15);
				System.out.println("com desconto de 15% : R$"+desconto);
			}else if(dia >1 && dia<= 5) {
				desconto = nivel4 - (nivel4 * 0.10);
				System.out.println("com desconto de 10% : R$"+desconto);
			}else if(dia >5 && dia <=10) {
				desconto = nivel4 - (nivel4 * 0.0389);
				System.out.println("com desconto de 3,89% : R$"+desconto);
			}else {
				System.out.println("sem desconto \nValor a pagar : R$"+nivel4);
			}
		break;
		}
	}
}
