import javax.swing.JOptionPane;

public class Algoritmo_108 {

	public static void main(String[] args) {
		 String nome;
		String sobrenome;
			nome = JOptionPane.showInputDialog("Seu nome é : ");
			sobrenome = JOptionPane.showInputDialog("Seu sobrenome é : ");
			
			if (sobrenome != null && !sobrenome.isEmpty()) {
	          
	            if (sobrenome.equalsIgnoreCase("José")) {
	                JOptionPane.showMessageDialog(null, "o sobrenome: " +sobrenome);
	            }
	        }	
	}
}