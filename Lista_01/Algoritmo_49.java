import java.util.Scanner;

public class Algoritmo_49 {
    public static void main(String[] args) {
        String nome;
        int tamanho;
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();

        tamanho = nome.length();

        // Todo o nome
        System.out.println("Nome completo: " + nome);

        // Tamanho
        System.out.println("Tamanho: " + tamanho);

        // Primeiro caractere
        System.out.println("Primeiro caractere: " + nome.charAt(0));

        // Último caractere
        System.out.println("Último caractere: " + nome.charAt(tamanho - 1));

        // Do primeiro até o terceiro (índices 0, 1, 2)
        if (tamanho >= 3)
            System.out.println("Primeiro até o terceiro: " + nome.substring(0, 3));
        else
            System.out.println("Nome tem menos de 3 caracteres.");

        // Quarto caractere (índice 3)
        if (tamanho >= 4)
            System.out.println("Quarto caractere: " + nome.charAt(3));
        else
            System.out.println("Nome tem menos de 4 caracteres.");

        // Todos menos o primeiro
        if (tamanho >= 2)
            System.out.println("Todos menos o primeiro: " + nome.substring(1));
        else
            System.out.println("Nome tem apenas um caractere.");

        // Dois últimos caracteres
        if (tamanho >= 2)
            System.out.println("Dois últimos caracteres: " + nome.substring(tamanho - 2));
        else
            System.out.println("Nome tem menos de 2 caracteres.");
    }
}
