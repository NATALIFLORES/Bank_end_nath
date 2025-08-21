import java.util.Scanner;

public class Loop_265{
    public static void main(String[] args) {
		int numero,
		int acm = 0;
		Scanner ler =new Scanner(System.in);
		
		System.out.println("Digite numero:");
		numero = ler.nextInt();
		
		while(true) {
            if(numero >0){
			     if(numero >=100 && numero<=200) {
				     acm = acm + 1;
			}else {
				break;
			}
			System.out.println("para exectar digite 0 \nDigite numero:");
			numero = ler.nextInt();
		}
		System.out.println("total de numero digite: "+acm);
	}
}