import javax.swing.JOptionPane;

public class Allgoritmo_105 {

	public static void main(String[] args) {
		String texto,sigla;
		
		texto = JOptionPane.showInputDialog("Digite a UF do estado: ");
		sigla = texto.toUpperCase();
		if (sigla.equals("SP")) {
			JOptionPane.showMessageDialog(null,"é de são paulo");
		}else if(sigla.equals("RJ")) {
		    JOptionPane.showMessageDialog(null,"é de Rio de janeiro");
		}else if(sigla.equals("MG")) {
			JOptionPane.showMessageDialog(null," é de Minas gerais");
		}
		
	}

}