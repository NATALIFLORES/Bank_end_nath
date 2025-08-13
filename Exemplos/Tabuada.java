import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		double num;
		double num2;
		double multiplicacao;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		multiplicacao = num * num2;
		
		//System.out.println("Soma : "+multiplicacao);

		JOptionPane.showMessageDialog(null,"multiplica:"+multiplicacao);

	}

}