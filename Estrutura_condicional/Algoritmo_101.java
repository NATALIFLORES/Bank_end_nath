import javax.swing.JOptionPane;

public class Algoritmo_101 {

	public static void main(String[] args) {
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de 0 a 100: "));
		
		if(numero >=20 && numero <=90) {
			JOptionPane.showMessageDialog(null, "esta no intervalo");
		}else {
			JOptionPane.showMessageDialog(null, "Não esta no intervalo");
		}
	}

}