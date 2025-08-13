import javax.swing.JOptionPane;

public class Algoritmo_56 {

	public static void main(String[] args) {
		 
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		
		JOptionPane.showMessageDialog(null, "seu nome é "+nome+"\n sua idade é "+idade);

	}

}