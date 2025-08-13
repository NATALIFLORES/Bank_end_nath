
import java.util.Scanner;

public class Algoritmo_41{
    public static void main(String[] args) {
        double n1,n2,n3,n4;
        double mediaPoderada;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro n°: ");
        n1 = ler.nextInt();

        System.out.println("Digite o segundo n°: ");
        n2 = ler.nextInt();

        System.out.println("Digite o terceiro n°: ");
        n3 = ler.nextInt();

        System.out.println("Digite o quarta n°: ");
        n4 = ler.nextInt();
//calculo
        mediaPoderada = (n1*1 + n2*2 + n3*3 + n4*4) / (1+2+3+4);
        System.out.println("A média ponderada: "+mediaPoderada);
    }

}