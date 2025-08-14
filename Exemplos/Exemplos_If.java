public class Exemplos_If{
    public static void main(String[] args){
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));

        if(idade >=16){
            JOptionPane..showMessageDialog(null, "Pode Votar");
        }else{
        	JOptionPane.showMessageDialog(null, "Não pode votar");

        }
    }
}