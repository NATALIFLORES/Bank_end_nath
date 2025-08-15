import javax.swing.JOptionPane;

public class Algoritmo_102 {
//tem que arrumar
	public static void main(String[] args) {
		int n;
		 n = Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero:"));
		 
		 if(n >=18 ) {
			 JOptionPane.showMessageDialog(null,"Este numero e maior que 20.");
		 } else if(n >=18 || n <=21){
			 JOptionPane.showMessageDialog(null, "este e o mesmo numero do 20");
		 }else if(n <=20) {
			 JOptionPane.showMessageDialog(null,"este numero e menor que 20");
	}
}
}