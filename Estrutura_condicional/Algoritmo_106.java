import javax.swing.JOptionPane;

public class Algoritmo_106 {

	public static void main(String[] args) {
		String nome;
		
		nome = JOptionPane.showInputDialog("Seu nome é : ");
		
		
		 if (nome != null && !nome.isEmpty()) {
	            char primeiraLetra = Character.toUpperCase(nome.charAt(0));
	            if (primeiraLetra == 'A') {
	                JOptionPane.showMessageDialog(null, "O seu nome começa com a letra A: " + nome);
	            }
	        }	
	}

}