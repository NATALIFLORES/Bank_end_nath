import javax.swing.JOptionPane;

public class Algoritmo_109 {

	public static void main(String[] args) {

	    String nome,nome2;
	    
	    nome= JOptionPane.showInputDialog("bem vindo \ndigite seu nome:");
	    nome2 = JOptionPane.showInputDialog("Olá \n Digite o seu nome: ");

        if (nome.compareTo(nome2) < 0) {
            JOptionPane.showInputDialog(nome+"vem primeiro");
        } else if (nome.compareTo(nome2) > 0) {
            System.out.println(nome2 + " vem antes de " + nome);
        } else {
            System.out.println("As palavras são iguais.");
        }
    }
}