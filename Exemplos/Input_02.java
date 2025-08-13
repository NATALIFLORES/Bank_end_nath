import javax.swing.JOptionPane;

public class Input_02 {

	public static void main(String[] args) {
		int num01;
		int num02;
		int soma;
		String aux;
		
		
		aux = JOptionPane.showInputDialog("Digite um numero: ");
		num01 = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("Digite um numero: ");
		num02 = Integer.parseInt(aux);
		
		soma = num01 + num02;
		
		JOptionPane.showMessageDialog(null, "Total: "+soma);
	}
}