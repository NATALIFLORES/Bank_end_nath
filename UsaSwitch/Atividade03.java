
import javax.swing.JOptionPane;

public class Ativ_Valiativa02 {
// ESSTE TA EM FORMATO DE UM TELA/JANELA
	public static void main(String[] args) {
		double valorB = 80, valorI = 120, valorA = 180 ,valorV = 250;
		double desconto, dia;
		String op;
		dia = Double.parseDouble(JOptionPane.showInputDialog("Quando dias do 3,7 e 10 dias ate o pagamento: "));
        op = JOptionPane.showInputDialog("Selecione qual era seu plano, comforme em isso o formato de pagamento do dia se tem ou nao um desconto:"
        		+ " \n Plano Básico = R$80,00 "
        		+"\n Plano Intermediário = R$120,00"
        		+"\n Plano Avançado = R$180,00"
        		+"\n Vip = 250,00");

		
		switch (op){
        case "Básico":
            if(dia <=3 ) {
            	desconto = valorB - (valorB *0.12);
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
            }else if(dia >3 && dia <= 7) {
            	desconto = valorB - (valorB * 0.07);
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);

            }else if(dia >7 && dia <=10) {
            	desconto = valorB - (valorB * 0.03);
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);

            }else {
            	JOptionPane.showMessageDialog(null, "Sem desconto \nvalor á pagar : R$ "+valorB);
            }
    break;
        case"Intermediário":
        	if(dia <= 3) {
        		desconto = valorI - (valorI * 0.12);
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else if(dia >3 && dia <= 7) {
        		desconto = valorI - (valorI * 0.07);
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else if(dia >7 && dia <=10) {
        		desconto = valorI - (valorI * 0.03);
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else {
            	JOptionPane.showMessageDialog(null, "Sem desconto \nvalor á pagar : R$ "+valorI);
            }
        break;
        case"Avançado":
        	if(dia <= 3) {
        		desconto = valorA - (valorA * 0.12);
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else if(dia >3 && dia <= 7) {
        		desconto = valorA - (valorA * 0.07);
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else if(dia >7 && dia <=10) {
        		desconto = valorA - (valorA * 0.03);
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else {
            	JOptionPane.showMessageDialog(null, "Sem desconto \nvalor á pagar : R$ "+valorA);
            }
        break;
        case "VIP":
        	if(dia <= 3) {
        		desconto = valorV - (valorV * 0.12);
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else if(dia >3 && dia <= 7) {
        		desconto = valorV - (valorV * 0.07);
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else if(dia >7 && dia <=10) {
        		desconto = valorV - (valorV * 0.03);
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else {
            	JOptionPane.showMessageDialog(null, "Sem desconto \nvalor á pagar : R$ "+valorV);
            }
	    }

   }
}