import javax.swing.JOptionPane;

public class Algoritmo_58 {

	public static void main(String[] args) {
		double xnum1, xnum2, xnum3;
		
		xnum1=Integer.parseInt(JOptionPane.showInputDialog("primeiro valor: "));
		xnum2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo valor: "));
		xnum3= Integer.parseInt(JOptionPane.showInputDialog("terceiro valor: "));
		
		double logBase2 = Math.log(64) / Math.log(2); 
        double X = xnum1 + (xnum2 / (xnum3 + xnum1)) + 2 * (xnum1 - xnum2) + logBase2;
         double arrendondado = Math.round(X);
         double truncado = Math.floor(X);
       
         JOptionPane.showMessageDialog(null,String.format("O valor do x : %.3f%n",X));//esta uma forma de um valor pegar a cantidade depois da virgula
        JOptionPane.showMessageDialog(null,"\nO valor truncado : "+truncado+"\nValor inteiro:"+arrendondado);
	}

}
