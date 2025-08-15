import javax.swing.JOptionPane;

public class Algoritmo_110 {

	public static void main(String[] args) {
		int n,n1;
		
		n=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		n1=Integer.parseInt(JOptionPane.showInputDialog("Otrou numero: "));
		
		if(n<n1) {
			JOptionPane.showMessageDialog(null,n+" antes "+n1);
		}else if(n>n1) {
			JOptionPane.showMessageDialog(null,n1+" depois "+n);
		}else {
			JOptionPane.showMessageDialog(null, "os numeros sao iguais");
		}
	}

}