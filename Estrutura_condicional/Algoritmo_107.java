import javax.swing.JOptionPane;

public class Algoritmo_107 {

	public static void main(String[] args) {
    String nome, sobrenome;
		
		nome = JOptionPane.showInputDialog("Seu nome é : ");
		sobrenome = JOptionPane.showInputDialog("Seu sobrenome é : ");
		
		 if (sobrenome.equals("José")) {
	                JOptionPane.showMessageDialog(null,"seu sobrenome têm José");
	        }
	}

}