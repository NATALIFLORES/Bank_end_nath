import javax.swing.JOptionPane;

public class UsandoSwitch02 {

	public static void main(String[] args) {
		double numero01,numero02,total;
        String op;

        numero01 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        numero02 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));

        op = JOptionPane.showInputDialog("Digite: \n + para soma"+"\n - para subtração"+"\n * para multiplicação"+"\n / para divisão"+"\n ^ para exponenciação");

        switch (op){
            case "+":
                if(numero01>0 && numero02>0) {
                	total = numero01 + numero02;
                	JOptionPane.showMessageDialog(null,"total: "+total);
                }else {
                	JOptionPane.showMessageDialog(null, "Numero inválido");
                }
        break;
        
            case "-":
                total = numero01-numero02;
                JOptionPane.showMessageDialog(null,"total: "+total);
        break;
        
            case "*":
                total = numero01*numero02;
                JOptionPane.showMessageDialog(null,"total: "+total);
        break;
        
            case "/":
                total = numero01/numero02;
                JOptionPane.showMessageDialog(null,"total: "+total);
        break;
        
            case "^":
                total = Math.pow(numero01,numero02);
                JOptionPane.showMessageDialog(null,"total: "+total);
        
        
        break;
    }

	}

}