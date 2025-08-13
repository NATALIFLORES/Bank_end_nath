
import java.util.Scanner;

public class Algoritmo_40{
public static void main(String[] args) {
   int dividendo,divisor,quociente,resto;
   
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o dividendo: ");
    dividendo = ler.nextInt();

    System.out.println("Digite o divisor: ");
    divisor = ler.nextInt();

    quociente = dividendo / divisor;
    resto = dividendo % divisor;

    System.out.println("dividendo "+dividendo+"\ndivisor "+divisor+"\nquociente "+quociente+"\nresto "+resto);
    ler.close();
}
}