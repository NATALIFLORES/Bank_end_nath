import java.util.Scanner;

public class loop_264 {

	public static void main(String[] args) {
        int acm= 0;
        double media,numero, soma =0;
        Scanner ler= new Scanner(System.in);

        System.out.println("Digite um numero positivo");
        numero = ler.nextInt();

        while(true){
            if(numero >=0 ){
                soma = soma+numero;
                acm = acm +1;
            }else{
                break;
            }
            System.out.println("Digite um numero positivo");
            numero = ler.nextInt();
        }
        media = soma /acm;
        System.out.println("Média: "+media);
    }
}