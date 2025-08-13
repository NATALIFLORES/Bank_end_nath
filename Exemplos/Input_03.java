import javax.swing.JOptionPane;

public class Input_03 {

	public static void main(String[] args) {
		int num01;
		int num02;
		int soma;
		
		num01 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		num02 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		
		soma = num01+ num02;
		
		JOptionPane.showMessageDialog(null,"Total:"+soma);

	}

}