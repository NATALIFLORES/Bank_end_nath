public class Operadores_01 {

	public static void main(String[] args) {
		double num01 = 15;
		double num02 = 20;
		double soma;
		double subtracao;
		double multiplicacao;
		double divisao;
		double resto;
		
		soma = num01 + num02;
		subtracao = num01  -  num02;
		multiplicacao = num01  *  num02;
	    divisao = num01 / num02;
		resto = num01 % num02;
		
		System.out.println("Soma"+soma+
				"\nSubtração"+subtracao+
				"\nMultiplicação"+multiplicacao+
				"\nDivição"+divisao+
				"\nResto"+resto);
	}

}