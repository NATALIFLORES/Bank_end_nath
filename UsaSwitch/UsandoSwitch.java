public class UsandoSwitch{
//este é um exemplo
    public static void main(String[] args){

        double numero01,numero02,total;
        String op;

        numero01 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        numero02 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));

        op = JOptionPane.showInputDialog("Digite: \n + para soma"+"\n - para subtração"+"\n * para multiplicação"+"\n / para divisão"+"\n ^ para exponenciação");

        Switch (op){
            case "+":
                total = numero01+numero02;
                JOptionPane.showMessageDialog(null,"total: "+total);
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
                total = Math.pow(numero01+numero02);
                JOptionPane.showMessageDialog(null,"total: "+total);
        
        default;
        break;
    }
}