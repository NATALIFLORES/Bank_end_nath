import javax.swing.JOptionPane;

public class Algoritmo_59 {

	public static void main(String[] args) {
		double catetos, catetos1;
		
		
		catetos =Integer.parseInt(JOptionPane.showInputDialog("Digite o catetos: "));
		catetos1 = Integer.parseInt(JOptionPane.showInputDialog("Segundo catetos: "));
		
        /*
		 double multiplica = catetos*catetos;( esta e conta de base e expoente Math.pow)
		 double m = catetos1*catetos1;
		 double soma = multiplica + m;
		 double raiz = Math.sqrt(soma);  (esta e uma conta de raiz quadrada Math.sqrt)
		  este formata e sem o Math
		System.out.println(multiplica);
		*/
        double hipotenusa = Math.sqrt(Math.pow(catetos, 2) + Math.pow(catetos1, 2));
        
        JOptionPane.showMessageDialog(null, "A hipotenusa : "+hipotenusa);

	}

}