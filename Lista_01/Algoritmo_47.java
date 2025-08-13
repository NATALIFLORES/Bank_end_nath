import java.util.Scanner;

public class Algoritmo_47 {
    public static void main(String[] args) {
        int n,cen,dez,uni;
        int invertido;

        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um número no formato CDU: ");
        n = ler.nextInt();
        
        cen = n / 100;
        dez = (n % 100) / 10;
        uni = n % 10;
        
        invertido = uni * 100 + dez * 10 + cen;
        
        System.out.println("Número invertido (UDC): " + invertido);
    }
}