
public class Contadora {
    
public static void main(String[] args) throws InterruptedException{
    int numero, total;
    int cont = 0;
    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para tabuada"));

    while (cont <11){
        total = numero * cont;
        System.out.println(numero+" x "+cont+" = "+total);
        thread.sleep(1000);
        cont++;
    }

 }
}