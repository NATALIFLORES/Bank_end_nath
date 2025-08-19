import javax.swing.JOptionPane;

public class Ativ_Valiativa02 {

	public static void main(String[] args) {
		double valorB = 80;
	    double valorI = 120; 
	    double valorA =180;
	    double valorV =250;
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
            	desconto = valorB *0.88;
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
            }else if(dia >3 && dia <= 7) {
            	desconto = valorB * 0.93;
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);

            }else if(dia >7) {
            	desconto = valorB * 0.97;
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);

            }else if (dia > 10) {
            	JOptionPane.showMessageDialog(null, "Após do dia 10 nao tem desconto \n valor Bruto é:"+valorB);
            }
    break;
        case"Intermediário":
        	if(dia <= 3) {
        		desconto = valorI * 0.88;
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else if(dia >3 && dia <= 7) {
        		desconto = valorI * 0.93;
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else if(dia > 7) {
        		desconto = valorI * 0.97;
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else if(dia > 10) {
        		
            	JOptionPane.showMessageDialog(null,"Sem desconto: "+valorI);
        	}
        	
        break;
        case"Avançado":
        	if(dia <= 3) {
        		desconto = valorA * 0.88;
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else if(dia >3 && dia <= 7) {
        		desconto = valorA * 0.93;
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else if(dia > 7) {
        		desconto = valorA * 0.97;
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else if(dia > 10) {
        		
            	JOptionPane.showMessageDialog(null,"Sem desconto: "+valorA);
        	}
        break;
        case "VIP":
        	if(dia <= 3) {
        		desconto = valorV * 0.88;
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else if(dia >3 && dia <= 7) {
        		desconto = valorV * 0.93;
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else if(dia > 7) {
        		desconto = valorV * 0.97;
            	JOptionPane.showMessageDialog(null,"Com desconto: "+desconto);
        	}else if(dia > 10) {
            	JOptionPane.showMessageDialog(null,"Sem desconto: "+valorV);
        	}
        	
	    }

   }
}