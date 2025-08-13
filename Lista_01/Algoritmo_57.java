import javax.swing.JOptionPane;

public class Algoritmo_57 {

	public static void main(String[] args) {
		double nota1,nota2,media;
		double arrendondado,truncado;
		nota1 = Integer.parseInt(JOptionPane.showInputDialog("Nota do primeira prova:"));
		nota2 = Integer.parseInt(JOptionPane.showInputDialog("Nota daa segunda prova: "));
		
		media =(nota1+nota2)/2;
		arrendondado = Math.round(media);
		truncado = Math.floor(media);
		
		JOptionPane.showMessageDialog(null, "Calculo da suas notas: "+media+"\nNota inteiro: "+arrendondado+"\nNota quebrado:"+truncado);
	}

}