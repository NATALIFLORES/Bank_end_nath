import javax.swing.JOptionPane;

public class Algoritmo_103 {

	public static void main(String[] args) {
		int anoAtual, anoNaci;
		int idade;
		boolean ano;
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano referente:"));
		anoNaci = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nacimento: "));
		
		idade = anoAtual - anoNaci ;
		
		ano = anoAtual > anoNaci;
		
		JOptionPane.showMessageDialog(null,"Sua idade é: "+idade);
	}

}