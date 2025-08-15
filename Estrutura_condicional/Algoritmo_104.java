import javax.swing.JOptionPane;

public class Algoritmo_104 {

	public static void main(String[] args) {
		String nome,genero;
		String sigla ;
		int idade ;
		
		nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		genero = JOptionPane.showInputDialog("seu genero entre F ou M: ");
		sigla = genero.toUpperCase();
		idade = Integer.parseInt(JOptionPane.showInputDialog("Sua idade é: "));
		

		if(genero ==" F" || idade <=25) {
			JOptionPane.showMessageDialog(null, "A aceita");
		}else if(genero =="F" && idade>=24){
			JOptionPane.showMessageDialog(null, "Não aceito!!!");
		}

	}

}